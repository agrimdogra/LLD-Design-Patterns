package designpatterns.ui5buttons;

import lombok.ToString;

@ToString
public class Observer1 extends Observer {
    Button button;

    public Observer1(Button button, ListnerEvents event) {
        this.button = button;
        button.registerEvent(event, this);

        this.description = "Observer 1";
    }

    @Override
    public void update(ListnerEvents listnerEvents, Observer observer) {
        System.out.println("Calling the Listener Event " + listnerEvents + "for " + observer);
    }
}
