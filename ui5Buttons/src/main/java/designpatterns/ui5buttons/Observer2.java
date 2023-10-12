package designpatterns.ui5buttons;

import lombok.ToString;

@ToString
public class Observer2 extends Observer {
    Button button;

    public Observer2(Button button) {
        this.button = button;
        button.registerEvent(ListnerEvents.OnClick, this);

        this.description = "Observer 2";
    }

    @Override
    public void update(ListnerEvents listnerEvents, Observer observer) {
        System.out.println("Calling the Listner Event " + listnerEvents + "for " + observer);
    }
}
