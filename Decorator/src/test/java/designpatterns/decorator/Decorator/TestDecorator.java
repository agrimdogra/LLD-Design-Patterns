package designpatterns.decorator.Decorator;

import designpatterns.decorator.factory.AbstractIceCreamFactory;
import designpatterns.decorator.factory.BaseType;
import designpatterns.decorator.factory.SimpleStoreFactory;
import designpatterns.decorator.factory.ToppingType;
import org.junit.jupiter.api.Test;

public class TestDecorator {
    @Test
    public void TestVanillaChocolate(){
        IceCream iceCream = new ConeBase();
        iceCream = new VanillaTopping(iceCream);
        iceCream = new ChocolateTopping(iceCream);
        iceCream = new VanillaTopping(iceCream);

        System.out.println("final desc "+ iceCream.getDescription());
        System.out.println("final price " + iceCream.getCost());
    }

    @Test
    public void testVanillaChocolateWithFactory(){
        AbstractIceCreamFactory factory =  SimpleStoreFactory.createStoreFactory();
        IceCream finalIceCream = factory.createTopping(ToppingType.VANILLA,factory.createTopping(ToppingType.CHOCOLATE,factory.createTopping(ToppingType.VANILLA,factory.createBase(BaseType.CONE))));
        System.out.println(finalIceCream.getCost());
    }
}
