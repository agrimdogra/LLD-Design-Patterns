public class Penguin extends Bird{
    public Penguin(String name, Type type, Beak beak, String color) {
        super(name, type, beak, color);
    }

    @Override
    public void fly() {
        throw new FlyException("Penguin do not fly");
    }
}
