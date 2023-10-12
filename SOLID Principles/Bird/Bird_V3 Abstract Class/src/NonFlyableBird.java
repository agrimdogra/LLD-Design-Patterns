public abstract class NonFlyableBird extends Bird{

    public NonFlyableBird(String name, Type type, Beak beak, String color) {
        super(name, type, beak, color);
    }

    @Override
    public abstract void makeSound();

}
