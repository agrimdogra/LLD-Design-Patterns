package designpatterns.ui5buttons;

public abstract class Observer {
    String description;
    public abstract void update(ListnerEvents listnerEvents, Observer observer);
}
