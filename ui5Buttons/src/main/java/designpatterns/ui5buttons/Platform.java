package designpatterns.ui5buttons;

public interface Platform {
    public String platformDescription();
    public Button createButton(ButtonType buttonType);
}
