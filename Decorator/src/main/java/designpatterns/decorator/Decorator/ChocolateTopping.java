package designpatterns.decorator.Decorator;

public class ChocolateTopping extends IceCreamDecorator{
    public ChocolateTopping(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return this.getIceCream().getDescription() + "," + "Chocolate";
    }

    @Override
    public Integer getCost() {
        return this.getIceCream().getCost() + 30;
    }
}
