public abstract class Bird {
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

    public abstract void makeSound();
}

//        switch (type) {
//                case EAGLE -> System.out.println("Eagle sound : whistling");
//                case OSTRICH -> System.out.println("Ostrich sound : boom");
//                case PENGUIN -> System.out.println("Penguin sound : Honk");
//                case SPARROW -> System.out.println("Sparrow sound : Chirrup");
//                }
