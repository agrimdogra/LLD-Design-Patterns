public class Penguin extends Bird implements Swimable{
    public Penguin(String name, Type type, Beak beak, String color) {
        super(name, type, beak, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin sound : Honk");
    }

    @Override
    public void swim() {
        System.out.println("Iam an Penguin and can swim");
    }
}
