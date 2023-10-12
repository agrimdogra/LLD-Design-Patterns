package designpatterns.factory.Implementation.SimpleFactory;

import org.junit.jupiter.api.Test;

import java.util.List;

public class SimpleFactoryTester {
    @Test
    public void SimpleTest(){
        Button rectangleButton = ButtonFactory.createButton(ButtonType.RECTANGLE, null, 20.1,5.5);
        Button squareButton= ButtonFactory.createButton(ButtonType.SQUARE, null, 20.0,null);
        Button roundButton = ButtonFactory.createButton(ButtonType.ROUND, 5.0, null,null);

        List<Button>list = List.of(rectangleButton, roundButton, squareButton);
        list.forEach(Button::render);
    }
}
