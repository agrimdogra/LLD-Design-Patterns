package designpatterns.decorator.Implementations.IceCream;

import org.junit.jupiter.api.Test;

public class TestIceCreamDecorator {
    @Test
    public void testIceCream(){
        IceCream coneIceCream = new ConeIceCream(20.0);
        IceCream iceCream = new Butterscotch(new Vanilla(new Butterscotch(coneIceCream,40.0), 30.0 ),40.0) ;
        System.out.println(iceCream.getDescription());
        System.out.println(iceCream.getCost());
    }
}
