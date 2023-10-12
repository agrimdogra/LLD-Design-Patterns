public abstract class FlyableBird extends Bird{

    public FlyableBird(String name, Type type, Beak beak, String color) {
        super(name, type, beak, color);
    }

    @Override
    public abstract void makeSound();

    public abstract void fly();
}
