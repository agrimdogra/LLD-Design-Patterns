package designpatterns.decorator.Decorator;

public class CupBase extends IceCream{

    @Override
    public String getDescription() {
        return "Cup Base";
    }

    @Override
    public Integer getCost() {
        return 20;
    }
}
