package designpatterns.singleton;

public class ConnectionPool {

    private static ConnectionPool Instance = null;
    private Integer numberOfConnections;
    private ConnectionPool(Integer numberOfConnections) {
        this.numberOfConnections = numberOfConnections;
    }

    public static ConnectionPool getInstance(Integer numberOfConnections){
        if(Instance == null)
            Instance = new ConnectionPool(numberOfConnections);

        return Instance;
    }

}
