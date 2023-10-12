package Gen5_Solution;


public class Client {
    public static void main(String[] args) {
        Student st1 = new IntelligentStudent("Agrim", "20","99");
        Student st2 = st1.copy();
        System.out.println("st1:"  + st1);
        System.out.println("st2:"  + st2);


    }
}
