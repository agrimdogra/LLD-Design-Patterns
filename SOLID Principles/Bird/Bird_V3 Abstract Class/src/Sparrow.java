public class Sparrow extends FlyableBird{

    public Sparrow(String name, Type type, Beak beak, String color) {
        super(name, type, beak, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow sound : Chirrup");
    }

    @Override
    public void fly() {
        System.out.println("Iam a sparrow and can fly low");
    }
}
