package designpatterns.singleton;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {
    @Test
    public void testCreation(){
        ConnectionPool connectionPool1 = ConnectionPool.getInstance(5);
        Assertions.assertNotNull(connectionPool1);
        System.out.println(connectionPool1);
    }

    @Test
    public void testSingleton(){
        ConnectionPool connectionPool1 = ConnectionPool.getInstance(5);
        ConnectionPool connectionPool2 = ConnectionPool.getInstance(5);
        Assertions.assertEquals(connectionPool1,connectionPool2,"The objects are not equal");
        System.out.println("Obj1 : " + connectionPool1);
        System.out.println("Obj2 : " + connectionPool2);
    }
}
