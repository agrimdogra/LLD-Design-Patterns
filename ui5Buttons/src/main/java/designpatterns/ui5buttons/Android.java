package designpatterns.ui5buttons;

public class Android implements Platform {

    @Override
    public String platformDescription() {
        return "I am Android Plateform";
    }

    @Override
    public Button createButton(ButtonType buttonType) {
        return ButtonFactory.createButton(buttonType);
    }
}
