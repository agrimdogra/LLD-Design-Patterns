package designpatterns.ui5buttons;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class RectangleButton extends Button implements Area {
    Double side1;
    Double side2;
    @Override
    public Double getArea(Double side1, Double side2) {
        return null;
    }
}
