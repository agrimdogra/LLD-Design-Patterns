package designpatterns.builder.Implementation;

public class DatabaseV2 {
    private String name;
    private String userName;
    private String password;
    private Integer port;
    private DatabaseType databaseType;

    private DatabaseV2(){

    }

    public static DatabaseV2Builder builder(){
        return new DatabaseV2Builder();
    }

    public static class DatabaseV2Builder{
        DatabaseV2 databaseV2;
        private DatabaseV2Builder(){
            databaseV2 = new DatabaseV2();
            System.out.println(databaseV2);
        }

        public DatabaseV2Builder setName(String name) {
            databaseV2.name = name;
            return this;
        }

        public DatabaseV2Builder setUserName(String userName) {
            databaseV2.userName = userName;
            return this;
        }

        public DatabaseV2Builder setPassword(String password) {
            databaseV2.password = password;
            return this;
        }

        public DatabaseV2Builder setPort(Integer port) {
            databaseV2.port = port;
            return this;
        }

        public DatabaseV2Builder setDatabaseType(DatabaseType databaseType) {
            databaseV2.databaseType = databaseType;
            return this;
        }

        public DatabaseV2Builder mySQL(){
            databaseV2.databaseType = DatabaseType.SQL;
            return this;
        }

        public Boolean NameValidate(){
            return !databaseV2.name.toLowerCase().contains("agrim");
        }

        public DatabaseV2 build(){
            if (this.NameValidate()){
                return this.databaseV2;
            }
            throw new IllegalArgumentException("The arguments are not correct");
        }

    }
}
