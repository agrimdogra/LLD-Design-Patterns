package designpatterns.ui5buttons;

import lombok.ToString;

@ToString
public class Observer4 extends Observer {
    Button button;

    public Observer4(Button button) {
        this.button = PlatformFactory
                .createPlatmorm(Plateforms.WINDOWS)
                .createButton(ButtonType.RECTANGLE);
        button.registerEvent(ListnerEvents.OnTap, this);

        this.description = "Observer 4";
    }

    @Override
    public void update(ListnerEvents listnerEvents, Observer observer) {
        System.out.println("Calling the Listner Event " + listnerEvents + "for " + observer);
    }
}
