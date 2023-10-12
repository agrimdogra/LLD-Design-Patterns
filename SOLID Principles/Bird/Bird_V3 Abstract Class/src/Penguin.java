public class Penguin extends NonFlyableBird{
    public Penguin(String name, Type type, Beak beak, String color) {
        super(name, type, beak, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Ostrich sound : Honk");
    }

}
