package poket;

public class ChewingGum extends Food{
    private String privkus;

    public ChewingGum(String privkus) {
        super("Жевательная резинка");
        this.privkus = privkus;
    }

    @Override
    public void consume() {
        System.out.println(this + " съеденa");
    }

    public String toString(){
        return super.toString() + " с привкусом " + this.privkus;
    }
}
