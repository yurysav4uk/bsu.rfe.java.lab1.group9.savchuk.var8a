package poket;

public class Cheese extends Food {
    public Cheese() {
        super("Сыр");
    }

    public void consume() {
        System.out.println(this + " съеден");
    }
}
