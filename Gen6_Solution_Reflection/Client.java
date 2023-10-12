package Gen6_Solution_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Database db1 = Database.getInstance("palak", "Happy New Year 2023");
        Database db2 = null;
        Constructor[] constructor = db1.getClass().getDeclaredConstructors();
        for (Constructor item: constructor) {
            item.setAccessible(true);
            db2 = (Database) item.newInstance();
            break;
        }
        System.out.println("Hashcode for db1 - " + db1.hashCode());
        System.out.println("Hashcode for db2 - " + db2.hashCode());
    }
}
