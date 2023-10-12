package Gen3_Solution_synchronization;

public class Database {
    private static Database obj;
    private String uname;
    private String password;

    private Database(){
    }

    private Database(String uname, String password) {
        this.uname = uname;
        this.password = password;
    }

    // ------------****  Method which will return the instance  ****-----

    /**
     * Here we will user synchronize keyword on the function which returns the new object.
     * Hence no 2 threads will be able to enter the critical method and 2 objects will never be created.
     */

    public static synchronized Database getInstance(String uname, String password){
        if(obj == null){
            obj = new Database(uname,password);
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
