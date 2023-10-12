package Gen5_Solution_Serialization;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Database db1 =Database.getInstance("Dogra", "passw");
        FileOutputStream output_file = new FileOutputStream("dummyFile.ser");
        ObjectOutput out = new ObjectOutputStream(output_file);
        out.writeObject(db1);
        out.close();

        FileInputStream input_file = new FileInputStream("dummyFile.ser");
        ObjectInput in = new ObjectInputStream(input_file);
        Database db2 = (Database) in.readObject();
        in.close();

        System.out.println("Hashcode for db1 - " + db1.hashCode());
        System.out.println("Hashcode for db2 - " + db2.hashCode());

    }
}
