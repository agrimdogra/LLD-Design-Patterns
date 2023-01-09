package Gen1_Solution;

public class IntelligentStudent extends Student{
    String iq;

///////----Constructor-------////////

    public IntelligentStudent() {
        super();
    }

    public IntelligentStudent(String name, String age, String iq) {
        super(name, age);
        this.iq = iq;
    }

///////----Getters and Setters-------////////

    public String getIq() {
        return iq;
    }

    public void setIq(String iq) {
        this.iq = iq;
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
