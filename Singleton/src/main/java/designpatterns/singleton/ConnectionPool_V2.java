package designpatterns.singleton;

public class ConnectionPool_V2 {
    private static ConnectionPool_V2 Instance;
    private Integer numberOfConnections;

    private ConnectionPool_V2(Integer numberOfConnections) {
        this.numberOfConnections = numberOfConnections;
    }

    /**
     * Method 1 for thread safety
     * make complete method synchronized, but if will give a performance hit as all threads will have to wait and instance will be returned one after the other.
     *
     * Method 2: using a sync block and a sync monitor on class level.
     * use double if conditions to ensure the sync does not cause issues.
     */



/*  POSSIBLE SOLUTION 1 (WILL BLOCK EVERY THREAD)

    public static ConnectionPool_V2 getInstance(Integer numberOfConnections){
        synchronized (ConnectionPool_V2.class){
            if(Instance == null)
                Instance = new ConnectionPool_V2(numberOfConnections);
        }
        return Instance;
    }*/


/* Possible Solution2: will fail as if 2 threads read line 35 at same time, both will enter critical section

   public static ConnectionPool_V2 getInstance(Integer numberOfConnections){
        if (Instance == null){
            synchronized (ConnectionPool_V2.class){
                Instance = new ConnectionPool_V2(numberOfConnections);
            }
        }
        return Instance;
    }*/

// Double-Checked Lock approach

    public static ConnectionPool_V2 getInstance(Integer numberOfConnections){
        if (Instance == null){
            synchronized (ConnectionPool_V2.class){
                if (Instance == null)
                    Instance = new ConnectionPool_V2(numberOfConnections);
            }
        }
        return Instance;
    }

}

