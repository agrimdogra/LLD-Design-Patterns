package Gen4_Solution;

public class IntelligentStudent extends Student {
    String iq;

///////----Constructor-------////////

    public IntelligentStudent() {
        super();
    }

    public IntelligentStudent(String name, String age, String iq) {
        super(name, age);
        this.iq = iq;
    }

    /// Copy Constructor //
/*    protected IntelligentStudent(IntelligentStudent s){
        super(s);
        this.iq = s.getIq();
    }*/

///////----Getters and Setters-------////////

    public String getIq() {
        return iq;
    }

    public void setIq(String iq) {
        this.iq = iq;
    }

    @Override
    public IntelligentStudent copy() {
        //Student s =(Student)this.copy();
        //IntelligentStudent studNew = new IntelligentStudent(this);
        //return studNew;
        /**
         * But here the issue is if we internally call the copy method of parent class it will return an object of
         * Parent type and we will not be able to copy the elements of child class.
         *
         *
         * Approach 5:
         * Lets make constructor as private and call constructor from this copy method.
         */
      return null;
    }



    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "iq='" + iq + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
