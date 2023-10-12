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
        FlyableBird Eagle = new Eagle("Eagle", Type.EAGLE, Beak.SHARP, "Black");
        Bird Penguin = new Penguin("Penguin", Type.PENGUIN, Beak.STRONG, "Black_White");
        FlyableBird Sparrow = new Sparrow("Sparrow", Type.SPARROW, Beak.WEAK, "Green");
        fly(List.of(
                Eagle,
                Sparrow
        ));
    }
    public static void fly(List<FlyableBird> birds){
        birds.forEach(FlyableBird::fly);
    }
}
