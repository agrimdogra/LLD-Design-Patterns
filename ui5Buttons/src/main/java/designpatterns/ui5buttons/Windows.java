package designpatterns.ui5buttons;

public class Windows implements Platform {

    @Override
    public String platformDescription() {
        return "I am a Windows platform";
    }

    @Override
    public Button createButton(ButtonType buttonType) {
        return ButtonFactory.createButton(buttonType);
    }
}
