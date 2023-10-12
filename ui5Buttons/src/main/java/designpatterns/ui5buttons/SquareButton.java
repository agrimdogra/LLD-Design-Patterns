package designpatterns.ui5buttons;

import lombok.Builder;

@Builder
public class SquareButton extends Button implements Area{
    Double side;
    @Override
    public Double getArea(Double side1, Double side2) {
        return side1*side1;
    }
}
