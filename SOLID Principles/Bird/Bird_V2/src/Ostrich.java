public class Ostrich extends Bird{
    public Ostrich(String name, Type type, Beak beak, String color) {
        super(name, type, beak, color);
    }

    @Override
    public void fly() {
        System.out.println("I am flying like an Ostrich");
    }
}
