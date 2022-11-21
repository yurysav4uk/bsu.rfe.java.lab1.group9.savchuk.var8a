package MainPackage;// Объявление класса частью пакета

import poket.*;

public class MainApplication {
    // Конструктор класса отсутствует!!!
    // Главный метод главного класса
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        // Определение ссылок на продукты завтрака
        Food[] breakfast = new Food[20];
        // Анализ аргументов командной строки и создание для них
        // экземпляров соответствующих классов для завтрака
        int itemsSoFar = 0;
        int amountCheese = 0, amountApples = 0, amountGum = 0;
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
// У сыра дополнительных параметров нет
                breakfast[itemsSoFar] = new Cheese();
            } else if (parts[0].equals("Apple")) {
// У яблока – 1 параметр, который находится в parts[1]
                breakfast[itemsSoFar] = new Apple(parts[1]);
            } else
// ... Продолжается анализ других продуктов для завтрака
                if (parts[0].equals("ChewingGum")) {
                    breakfast[itemsSoFar] = new ChewingGum(parts[1]);
                }
            itemsSoFar++;
        }
// Перебор всех элементов массива
        for (Food item : breakfast)
            if (item != null)
// Если элемент не null – употребить продукт
                item.consume();
            else
// Если дошли до элемента null – значит достигли конца
// списка продуктов, ведь 20 элементов в массиве было
// выделено с запасом, и они могут быть не
// использованы все
                break;

        String classToEqual = args[args.length - 1].substring(1);
        var splitClass = classToEqual.split("/");

        var amount = 0;
        for (Food item : breakfast) {
            if (splitClass[0].equals("Cheese")) {
                if (item != null && item.equals(new Cheese()))
                    amount++;
            } else if (splitClass[0].equals("Apple")) {
                if (item != null && item.equals(new Apple(splitClass[1])))
                    amount++;
            } else if (splitClass[0].equals("ChewingGum")) {
                if (item != null && item.equals(new ChewingGum(splitClass[1])))
                    amount++;
            }
        }

        System.out.println(amount);
        System.out.println("Всего хорошего!");
    }
}

