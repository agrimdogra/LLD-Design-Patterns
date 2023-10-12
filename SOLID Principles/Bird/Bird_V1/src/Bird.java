/** Problems with this approach:

 * Here we are handling to many behaviours of(ostrich,penguin, sparrow etc).
 * We are using If-Else or Switch-Case ladder (violating SRP)
 * Our methods are not reusable, hence OCP is also not followed
 * If we want to reuse the fly behaviour of ostrich, we cannot do, we will have to copy and paste the code (not good)

 Solution
 * Create an abstract class and make fly method as Abstract

 */


public class Bird {
    String name;
    Type type;
    Beak beak;
    String color;

    public Bird(String name, Type type, Beak beak, String color) {
        this.name = name;
        this.type = type;
        this.beak = beak;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Beak getBeak() {
        return beak;
    }

    public void setBeak(Beak beak) {
        this.beak = beak;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     *  Main Methods:
     *  eat(), fly(), makeSound()
     */

    public void eat(){
        System.out.println("Hello I am Eating Food");
    }

    public void fly(){
        switch (type) {
            case EAGLE -> System.out.println("Flying like Eagle");
            case OSTRCH -> System.out.println("Flying like Ostrich");
            case PENGUIN -> throw new FlyException("I am a poor Penguin and I cannot fly");
            case SPARROW -> System.out.println("Flying like Sparrow");
        }
    }

    public void makeSound(){
        switch (type) {
            case EAGLE -> System.out.println("Eagle sound : whistling");
            case OSTRCH -> System.out.println("Ostrich sound : boom");
            case PENGUIN -> System.out.println("Ostrich sound : Honk");
            case SPARROW -> System.out.println("Sparrow sound : Chirrup");
        }
    }
}


