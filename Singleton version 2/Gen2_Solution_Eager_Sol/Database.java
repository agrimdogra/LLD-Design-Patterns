package Gen2_Solution_Eager_Sol;

public class Database {

    /**
     *  Eagerly initialize and create object, and return this obj for every request.
     *  Since it is initialized as static it will be initialized at boot time will not be changed by any thread.
     *  another instance cannot be created.
     */

    private static Database obj1 = new Database();
    /**
     * This solution works perfectly fine, The issue here is that this object will always be created by the static
     * block before loading of app, even if the object is not required.
     * So, it's not a good solution, Also at creation we cannot pass the parameters to the object.
     */


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
    public static Database getInstance(String uname, String password){
        obj1.setUname(uname);
        obj1.setPassword(password);
        return obj1;
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
