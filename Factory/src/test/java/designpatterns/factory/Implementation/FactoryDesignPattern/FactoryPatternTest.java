package designpatterns.factory.Implementation.FactoryDesignPattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactoryPatternTest {
    @Test
    public void RoundButtonTest(){
        ButtonFactory buttonFactory = new RoundButtonFactory();
        Button button = buttonFactory.createButton(2.0,null,null);

        Assertions.assertTrue(button instanceof RoundBtn, "worked fine for round button");
        System.out.println(button.getClass());
    }
}
