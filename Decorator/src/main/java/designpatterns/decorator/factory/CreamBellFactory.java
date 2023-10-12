package designpatterns.decorator.factory;

import designpatterns.decorator.Decorator.*;

public class CreamBellFactory implements AbstractIceCreamFactory{

    @Override
    public IceCream createBase(BaseType baseType) {
        return switch (baseType){
            case CUP -> new CupBase();
            case CONE -> new ConeBase();
        };
    }

    @Override
    public IceCreamDecorator createTopping(ToppingType toppingType, IceCream iceCream) {
        return switch (toppingType){
            case VANILLA -> new VanillaTopping(iceCream);
            case CHOCOLATE -> new ChocolateTopping(iceCream);
        };
    }
}
