package designpatterns.factory.Implementation.FactoryDesignPattern;

public class SquareButtonFactory implements ButtonFactory{

    @Override
    public Button createButton(Double radius, Double side1, Double side2) {
        return SquareButton.builder()
                .side(side1)
                .build();
    }
}
