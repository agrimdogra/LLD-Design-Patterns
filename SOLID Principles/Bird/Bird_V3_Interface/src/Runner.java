/**
 * Problem here is:
 * if we want a functionality that some birds can swim, we will have to create more classes
 * flyableSwimable, flyableNonSwimable
 * nonFlyableSwimmable, nonFlyableNonSwimable
 *
 * can cause class explosion at great level
 *
 * Solution:
 * User interfaces to define behaviours of a class
 *
 */

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Flyable Eagle = new Eagle("Eagle", Type.EAGLE, Beak.SHARP, "Black");
        Swimable Penguin = new Penguin("Penguin", Type.PENGUIN, Beak.STRONG, "Black_White");
        Flyable Sparrow = new Sparrow("Sparrow", Type.SPARROW, Beak.WEAK, "Green");
        Swimable Swan = new Swan("Sparrow", Type.Swan, Beak.WEAK, "White");
        fly(List.of(
                Eagle,
                Sparrow
        ));

        swim(List.of(
                Penguin,
                Swan
        ));


    }
    public static void fly(List<Flyable> birds){
        birds.forEach(Flyable::fly);
    }
    public static void swim(List<Swimable> birds){
        birds.forEach((Swimable::swim));
    }
}
