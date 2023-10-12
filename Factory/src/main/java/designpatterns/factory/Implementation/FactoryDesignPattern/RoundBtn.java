package designpatterns.factory.Implementation.FactoryDesignPattern;

import lombok.Builder;

@Builder
public class RoundBtn extends Button {
    private Double radius;

    public RoundBtn(Double radius) {
        this.radius = radius;
    }

    @Override
    public void render() {
        System.out.println("rendering like Round Button");
    }

    public Double getCircumference(){
        return 2*3.14*radius;
    }
}
