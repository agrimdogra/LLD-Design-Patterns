package Gen4_Solution_DCL;

import java.util.concurrent.locks.ReentrantLock;

public class Database {
    private static Database obj;
    private String uname;
    private String password;
    private static ReentrantLock mutex = new ReentrantLock();

    private Database(){
    }

    private Database(String uname, String password) {
        this.uname = uname;
        this.password = password;
    }

    // ------------****  Method which will return the instance  ****-----

    /**
     * Here we will use DCL (Double check Lock) to save our critical section.
     */

    public static Database getInstance(String uname, String password){
        if(obj == null){
            mutex.lock();
            if (obj == null){
                obj = new Database(uname,password);
            }
        }
        return obj;
    }

    //---- Getters and Setters---


    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
