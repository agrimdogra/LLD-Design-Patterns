package designpatterns.ui5buttons;

import lombok.ToString;

@ToString
public class Observer5 extends Observer {
    Button button;

    public Observer5(Button button) {
        this.button = PlatformFactory
                .createPlatmorm(Plateforms.WINDOWS)
                .createButton(ButtonType.RECTANGLE);
        button.registerEvent(ListnerEvents.OnClick, this);

        this.description = "Observer 5";
    }

    @Override
    public void update(ListnerEvents listnerEvents, Observer observer) {
        System.out.println("Calling the Listner Event " + listnerEvents + "for " + observer);
    }
}
