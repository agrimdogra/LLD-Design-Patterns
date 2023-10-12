package designpatterns.factory.Implementation.SimpleFactory;

import lombok.Builder;

@Builder
public class RectangularBtn extends Button implements Area{
    private Double side1;
    private Double side2;

    public RectangularBtn(Double side1, Double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public Double getArea(Double side1, Double side2) {
        return side1*side2;
    }

    @Override
    public void render() {
        System.out.println("rendering like Rectangular Button");
    }
}
