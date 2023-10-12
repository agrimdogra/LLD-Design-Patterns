package designpatterns.decorator.Implementations.IceCream;

public class Butterscotch extends IceCreamDecorator{
    IceCream iceCream;
    Double cost;

    public Butterscotch(IceCream iceCream, Double cost) {
        this.iceCream = iceCream;
        this.cost = cost;
    }


    @Override
    public Double getCost() {
        return iceCream.getCost() + cost;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "Butterscotch";
    }
}
