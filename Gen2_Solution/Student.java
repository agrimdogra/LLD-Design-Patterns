package Gen2_Solution;

public class Student {
    public String name;
    public String age;

///////----Constructors-------////////
    public Student(){

    }
    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    /// Copy Constructor //

    public Student(Student s){
        this.name = s.getName();
        this.age = s.getAge();
    }

///////----Getters and Setters-------////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
