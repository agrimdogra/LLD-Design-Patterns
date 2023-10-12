package designpatterns.ui5buttons;

import java.util.List;

public interface Subject {
    public void registerEvent(ListnerEvents event, Observer observer);
    public void deRegisterEvent(ListnerEvents event, Observer observer);
    public void notifyEvent(List<ListnerEvents> events);
}
