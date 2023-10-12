public class Duck extends Bird implements Swimable{
    public Duck(String name, Type type, Beak beak, String color) {
        super(name, type, beak, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Duck sound : Quack");
    }


    @Override
    public void swim() {
        System.out.println("Iam an Duck and can swim");
    }
}
