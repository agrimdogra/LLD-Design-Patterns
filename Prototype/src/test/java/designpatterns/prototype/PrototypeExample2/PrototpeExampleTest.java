package designpatterns.prototype.PrototypeExample2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;

public class PrototpeExampleTest {
    @Test
    public void testSquarePrototypes(){
        Square squarePrototype = new Square(5,"Red");
        Square square2 = squarePrototype.shapeClone();

        System.out.println("prototype : " + squarePrototype.hashCode());
        System.out.println("Square 2 : " + square2.hashCode());

        System.out.println("---------------------------------------");

        System.out.println("prototype : " + squarePrototype);
        System.out.println("Square 2 : " + square2);
        square2.setColour("blue");
        System.out.println("Square 2 : " + square2);
        Assertions.assertNotEquals(squarePrototype, square2, "The Object are same,hence not correct");

    }


    @Test
    public void testRectanglePrototypes(){
        Rectangle rectanglePrototype = new Rectangle(5,10, "Red");
        Rectangle rectangle2 = rectanglePrototype.shapeClone();

        System.out.println("prototype : " + rectanglePrototype.hashCode());
        System.out.println("rectangle 2 : " + rectangle2.hashCode());

        System.out.println("---------------------------------------");

        System.out.println("prototype : " + rectanglePrototype);
        System.out.println("rectangle 2 : " + rectangle2);
        rectangle2.setColour("blue");
        System.out.println("rectangle 2 : " + rectangle2);

        Assertions.assertNotEquals(rectanglePrototype, rectangle2, "The Object are same,hence not correct");
    }

}
