package designpatterns.ui5buttons;

import java.lang.annotation.ElementType;
import java.util.*;

public abstract class Button implements Subject{
    ButtonType buttonType;
    Map<ListnerEvents, List<Observer>> observers = new HashMap<>();

    @Override
    public void registerEvent(ListnerEvents event, Observer observer) {
        observers.putIfAbsent(event,new ArrayList<>());
        observers.get(event).add(observer);
    }

    @Override
    public void deRegisterEvent(ListnerEvents event, Observer observer) {
        observers.get(event).remove(observer);
    }

    @Override
    public void notifyEvent(List<ListnerEvents> events) {
        for(ListnerEvents eventListener : events){
            List<Observer> obs = observers.get(eventListener);
            if (obs != null){
                obs.forEach(a->a.update(eventListener, a));
            }
        }
    }

    public void TestPress(){
        List<ListnerEvents> events = new ArrayList<>();
        events.add(ListnerEvents.OnClick);
        events.add(ListnerEvents.OnTap);
        events.add(ListnerEvents.OnDoubleClick);

        notifyEvent(events);
    }
}
