package designpatterns.decorator.factory;

import designpatterns.decorator.Decorator.IceCream;
import designpatterns.decorator.Decorator.IceCreamDecorator;

public interface AbstractIceCreamFactory {
    public IceCream createBase(BaseType baseType);
    public IceCream createTopping(ToppingType toppingType, IceCream iceCream);
}
