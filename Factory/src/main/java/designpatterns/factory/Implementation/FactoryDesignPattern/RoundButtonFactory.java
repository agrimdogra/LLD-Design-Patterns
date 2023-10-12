package designpatterns.factory.Implementation.FactoryDesignPattern;

public class RoundButtonFactory implements ButtonFactory{

    @Override
    public Button createButton(Double radius, Double side1, Double side2) {
        return RoundBtn.builder()
                .radius(radius)
                .build();
    }
}
