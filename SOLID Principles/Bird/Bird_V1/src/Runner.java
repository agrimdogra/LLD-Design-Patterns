import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Bird eagle = new Bird("eagle", Type.EAGLE, Beak.SHARP, "Black");
        Bird sparrow = new Bird("sparrow", Type.SPARROW, Beak.WEAK, "Green");
        Bird penguin = new Bird("penguin", Type.PENGUIN, Beak.STRONG, "Black_White");

        List<Bird> birds = Arrays.asList(eagle, penguin, sparrow);

        birds.forEach(Bird::makeSound);
        birds.forEach(b->{
            try {
                b.fly();
            }
            catch (FlyException F ){
                System.out.println("--------" + F.getMessage());
            }
        });

    }
}
