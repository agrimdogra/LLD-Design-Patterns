package Gen2_Solution;


/**
 * Solution where client will use copy constructor of the class to copy the objects.
 *
 * But the same issue will happen here.
 */

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student("Agrim", "20");
        //Better approach as client does not have to care about manual copying
        // copy constructor will serve the purpose
        Student St2 = new Student(st1);

        // Use Polymorphism to create child obj in parent reference
        Student st3 = new IntelligentStudent("Amit","23", "50");

        /**
         *
         * We cannot use: Student st4 = new IntelligentStudent((IntelligentStudent) st1);
         *   - it will result in cast exception.
         *
         * So in this case also we will have to write additional code in constructor to check if it is an
         *  intance of child class or parent class.
         *
         *
         *  Still not a good solution
         *  We need to stop user from sending parameter to constructor.
         */


        Student st4 = new IntelligentStudent((IntelligentStudent) st3);


        //st4.setName(st3.getName());
        //st4.setAge(st3.getAge());




    }
}
