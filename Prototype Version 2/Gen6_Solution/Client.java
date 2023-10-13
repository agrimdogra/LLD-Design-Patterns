package Gen6_Solution;

public class Client {
    public static void main(String[] args) {
        Student st1 = new IntelligentStudent("Agrim", "23", "60");
        Student st2 = st1.copy();
        System.out.println("St1: " + st1);
        System.out.println("St2: " + st2);

    }
}
