package Gen6_Solution;

public class IntelligentStudent extends Student {
    String iq;

    public String getIq() {
        return iq;
    }

    public IntelligentStudent(String name, String age, String iq){
        super(name, age);
        this.iq = iq;
    }

    public void setIq(String iq) {
        this.iq = iq;
    }

    protected IntelligentStudent (IntelligentStudent s){
        super(s);
        this.iq = s.getIq();
    }

    @Override
    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
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
