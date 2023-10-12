public class Eagle extends Bird{

    public Eagle(String name, Type type, Beak beak, String color) {
        super(name, type, beak, color);
    }

    @Override
    public void fly() {
        System.out.println(" i am flying Like an Eagle");
    }
}
