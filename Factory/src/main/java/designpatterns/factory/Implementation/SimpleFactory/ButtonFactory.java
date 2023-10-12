package designpatterns.factory.Implementation.SimpleFactory;

public class ButtonFactory {
    public static Button createButton(ButtonType type, Double radius, Double side1, Double side2){
        return switch (type) {
            case ROUND -> new RoundBtn(radius);
            case SQUARE -> new SquareButton(side1);
            case RECTANGLE -> new RectangularBtn(side1, side2);
        };
    }
}
