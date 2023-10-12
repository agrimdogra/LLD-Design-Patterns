package designpatterns.decorator.Implementations.IceCream;

public class CupIceCream implements IceCream{
    Double cost;
    @Override
    public Double getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "CupIceCream";
    }
}
