public class Eagle extends Bird implements Flyable{
    public Eagle(String name, Type type, Beak beak, String color) {
        super(name, type, beak, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle sound : whistling");
    }

    @Override
    public void fly() {
        System.out.println("Iam an Eagle and can fly high");
    }


}
