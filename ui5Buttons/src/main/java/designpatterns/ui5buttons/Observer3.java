package designpatterns.ui5buttons;

import lombok.ToString;

@ToString
public class Observer3 extends Observer {
    Button button;

    public Observer3(Button button) {
        this.button = PlatformFactory
                .createPlatmorm(Plateforms.WINDOWS)
                .createButton(ButtonType.RECTANGLE);
        button.registerEvent(ListnerEvents.OnDoubleClick, this);

        this.description = "Observer 3";
    }

    @Override
    public void update(ListnerEvents listnerEvents, Observer observer) {
        System.out.println("Calling the Listner Event " + listnerEvents + "for " + observer);
    }
}
