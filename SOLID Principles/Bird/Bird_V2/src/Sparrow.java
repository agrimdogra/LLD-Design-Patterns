public class Sparrow extends Bird{
    public Sparrow(String name, Type type, Beak beak, String color) {
        super(name, type, beak, color);
    }

    @Override
    public void fly() {
        System.out.println("Flying like a Sparrow");
    }
}
