package designpatterns.factory.Implementation.FactoryDesignPattern;

import lombok.Builder;

@Builder
public class SquareButton extends Button implements Area {
    private Double side;

    public SquareButton(Double side) {
        this.side = side;
    }

    @Override
    public void render() {
        System.out.println("rendering like Square Button");
    }

    @Override
    public Double getArea(Double side1, Double side2) {
        return side1 * side1;
    }
}
