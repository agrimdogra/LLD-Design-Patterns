package Gen1_Solution;

public class Student{
    public String name;
    public String age;

///////----Constructors-------////////
    public Student(){

    }
    public Student(String name, String age) {
        this.name = name;
        this.age = age;
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
