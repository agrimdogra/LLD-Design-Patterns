package designpatterns.singleton;

import java.util.concurrent.Callable;

public class ConnectionPool_V3 {
    private static ConnectionPool_V3 Instance;
    private Integer numberOfConnections;

    private ConnectionPool_V3(Integer numberOfConnections) {
        this.numberOfConnections = numberOfConnections;
    }



//    public static ConnectionPool_V3 getInstance(Integer numberOfConnections){
//        if (Instance == null){
//            synchronized (ConnectionPool_V3.class){
//                if (Instance == null)
//                    Instance = new ConnectionPool_V3(numberOfConnections);
//            }
//        }
//        return Instance;
//    }

    public static ConnectionPool_V3 getInstance(Integer numberOfConnections){
        System.out.println(Thread.currentThread().getName());
        if (Instance == null){
            synchronized (ConnectionPool_V3.class){
                Instance = new ConnectionPool_V3(numberOfConnections);
            }
        }
        return Instance;
    }


}

