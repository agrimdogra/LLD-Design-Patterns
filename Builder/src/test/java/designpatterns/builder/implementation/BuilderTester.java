package designpatterns.builder.implementation;

import designpatterns.builder.Implementation.Database;
import designpatterns.builder.Implementation.DatabaseType;
import designpatterns.builder.Implementation.DatabaseV2;
import org.junit.jupiter.api.Test;

public class BuilderTester {
    @Test
    public void testBuilder(){
        Database.DatabaseBuilder builder = Database.builder();
        Boolean b =  builder
                .setName("agrim")
                .setUserName("mohan.sap")
                .setPassword("myPassword")
                .setDatabaseType(DatabaseType.CASANDRA)
                .setPort(8090)
                .NameValidate();
        System.out.println(b.booleanValue());

    }

    @Test
    public void testDatabase(){
        Database database = Database.builder()
                .setName("Dogra")
                .setUserName("mohan.sap")
                .setPassword("myPassword")
                .setDatabaseType(DatabaseType.CASANDRA)
                .setPort(8090)
                .mySQL()
                .build();
        System.out.println(database);
        database.setPort(9091);
        System.out.println(database);
    }

    @Test
    public void testDatabaseV2(){
        DatabaseV2 databaseV2 = DatabaseV2.builder()
                .setName("Dogra")
                .setUserName("DOGRAAG")
                .mySQL()
                .setPassword("hello123")
                .setPort(9092)
                .build();

        System.out.println(databaseV2.getClass());
        System.out.println(databaseV2);
    }
}
