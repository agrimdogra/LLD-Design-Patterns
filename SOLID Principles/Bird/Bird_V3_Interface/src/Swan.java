public class Swan extends Bird implements Swimable, Flyable{
    public Swan(String name, Type type, Beak beak, String color) {
        super(name, type, beak, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Swan sound : Quack - 2");
    }

    @Override
    public void fly() {
        System.out.println("Iam an Swan and can fly");
    }

    @Override
    public void swim() {
        System.out.println("Iam an Swan and can swim");
    }
}
