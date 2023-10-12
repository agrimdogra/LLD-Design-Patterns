package Gen1_Solution;

/**
 * Solution where client will try to copy the thing by his own.
 *
 * Problems:
 *      -> Lot of headache to the client to test things.
 *      -> If there is inheritance client has to check if object is instance of child class. then add attributes.
 *      -> There is a possibility that all the getters and setters are not exposed for a class.
 */

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student("Agrim", "20");
        //Manual copy:
        Student st2 = new Student();
        st2.setName(st1.getName());
        st2.setAge(st1.getAge());

        // Use Polymorphism to create child obj in parent reference
        Student st3 = new IntelligentStudent("Amit","23", "50");
        Student st4 = new IntelligentStudent();
        st4.setName(st3.getName());
        st4.setAge(st3.getAge());
        //------Problem here is now we cannot copy iq property, as st3 type does not have IQ.

        //Alternate plan to check if it is an instance and typecast. But lot of headache for client
        if (st4 instanceof IntelligentStudent){
            ((IntelligentStudent) st4).iq = ((IntelligentStudent)st3).getIq();
        }

    }
}
