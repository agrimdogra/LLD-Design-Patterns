package Gen3_Solution;


/**
 *
 */

public class Client {
    public static void main(String[] args) {
        Student st1 = new IntelligentStudent("Agrim", "20","99");
        Student st2 = new Student(st1);
        /**
         * Now here I want all the attributes of ST1 to be copied to st2 which is the main idea
         * behind prototype pattern.
         * But it will fail in this case as iq attribute will not be copied as constructor of Student will be called.
         *
         * Approach 4:
         * Lets add a copy method in base class, and it will be over ridden in inherited class,
         * So at runtime the over ridden method of object will be called.
         */

        System.out.println("st1 is ::: " + st1);
        System.out.println("st2 is ::" + st2);
        //Student st4 = new IntelligentStudent((IntelligentStudent) st3);


        //st4.setName(st3.getName());
        //st4.setAge(st3.getAge());




    }
}
