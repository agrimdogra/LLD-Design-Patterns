package designpatterns.decorator.factory;

public class SimpleStoreFactory {
    public static AbstractIceCreamFactory createStoreFactory(){
        return new CreamBellFactory();
    }
}
