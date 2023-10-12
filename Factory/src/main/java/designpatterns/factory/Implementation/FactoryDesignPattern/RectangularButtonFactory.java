package designpatterns.factory.Implementation.FactoryDesignPattern;

public class RectangularButtonFactory implements ButtonFactory{

    @Override
    public Button createButton(Double radius, Double side1, Double side2) {
        return RectangularBtn.builder()
                .side1(side1)
                .side2(side2)
                .build();
    }
}
