package Gen1_Solution_ThreadUnsafe;

public class Client {
    public static void main(String[] args) {
        Database db1 = Database.getInstance("Agrim", "helloAgrim");
        System.out.println(db1.hashCode());

        Database db2 = Database.getInstance("harsh", "helloHarsh");
        System.out.println(db1.hashCode());

        Database db3 = Database.getInstance("Champ", "helloChamp");
        System.out.println(db1.hashCode());

        /**
         * Output: All hash-codes are same, hence same object is used.
         * But there can be an issue with multithreading.
         * 1480010240
         * 1480010240
         * 1480010240
         */

    }

}
