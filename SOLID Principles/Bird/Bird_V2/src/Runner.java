/**
 * According to Liskovs Substitution, when we perform substitution on subtyping, we should not handle anything separately.
 * All the methods of parent should work with child entities
 *
  Solution:
 1. Use more Abstract classes (can cause class explosion more than IF)
 2. Use Interfaces (Better way)

 */



import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Bird Eagle = new Eagle("Eagle", Type.EAGLE, Beak.SHARP, "Black");
        Bird Penguin = new Penguin("Penguin", Type.PENGUIN, Beak.STRONG, "Black_White");
        Bird Ostrich = new Ostrich("Ostrich", Type.OSTRCH, Beak.STRONG, "Grey");
        makeMeFly(List.of(
                Eagle,
                Penguin,
                Ostrich
        ));
    }

    public static void makeMeFly(List<Bird> bird){
        bird.forEach(Bird::fly);
    }
}
