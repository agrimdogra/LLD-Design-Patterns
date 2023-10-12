package designpatterns.decorator.Implementations.IceCream;

import lombok.Setter;

@Setter
public class ConeIceCream implements IceCream{
    Double cost;

    public ConeIceCream(Double cost) {
        this.cost = cost;
    }

    @Override
    public Double getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "ConeIceCream";
    }
}
