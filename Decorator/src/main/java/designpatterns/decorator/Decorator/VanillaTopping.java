package designpatterns.decorator.Decorator;

public class VanillaTopping extends IceCreamDecorator{
    public VanillaTopping(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return this.getIceCream().getDescription() +", " + "Vanilla";
    }

    @Override
    public Integer getCost() {
        return this.getIceCream().getCost() + 20;
    }
}
