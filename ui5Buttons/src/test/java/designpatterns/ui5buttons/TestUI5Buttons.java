package designpatterns.ui5buttons;

import org.junit.jupiter.api.Test;

public class TestUI5Buttons {

    @Test
    public void testButton(){
        Button button =  PlatformFactory
                .createPlatmorm(Plateforms.WINDOWS)
                .createButton(ButtonType.RECTANGLE);

        Button button2 = PlatformFactory
                .createPlatmorm(Plateforms.WINDOWS)
                .createButton(ButtonType.ROUND);
        button.registerEvent(ListnerEvents.OnClick, new Observer() {
            @Override
            public void update(ListnerEvents listnerEvents, Observer observer) {
                System.out.println("I am listener");
            }
        });

        Observer1 observer1 = new Observer1(button, ListnerEvents.OnClick);
        Observer1 observer3 = new Observer1(button, ListnerEvents.OnTap);

        Observer1 observer4 = new Observer1(button2,ListnerEvents.OnClick);

        button.TestPress();
        button2.TestPress();
    }
}
