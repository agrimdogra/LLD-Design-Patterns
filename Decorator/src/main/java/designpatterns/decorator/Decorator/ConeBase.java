package designpatterns.decorator.Decorator;

public class ConeBase extends IceCream{

    @Override
    public String getDescription() {
        return "Cone Base";
    }

    @Override
    public Integer getCost() {
        return 30;
    }
}
