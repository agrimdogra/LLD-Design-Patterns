package designpatterns.ui5buttons;

public class ButtonFactory {
    public static Button createButton(ButtonType buttonType){
        switch (buttonType){
            case ROUND -> {
                return RoundButton.builder()
                        .setRadius(5.0)
                        .build();
            }
            case SQUARE -> {
                return SquareButton.builder()
                        .side(6.0)
                        .build();
            }
            case RECTANGLE -> {
                return RectangleButton.builder()
                        .side1(10.0)
                        .side2(11.0)
                        .build();
            }
        }
        throw new RuntimeException("Enter a valid button Type");
    }
}
