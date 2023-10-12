package designpatterns.builder.Implementation;

public class Database {
    private String name;
    private String userName;
    private String password;
    private Integer port;
    private DatabaseType databaseType;

    @Override
    public String toString() {
        return "Database{" +
                "name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", port=" + port +
                ", databaseType=" + databaseType +
                '}';
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public static DatabaseBuilder builder(){
        return new DatabaseBuilder();
    }

    public static class DatabaseBuilder{
        private String name;
        private String userName;
        private String password;
        private Integer port;
        private DatabaseType databaseType;

        public DatabaseBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public DatabaseBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public DatabaseBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public DatabaseBuilder setPort(Integer port) {
            this.port = port;
            return this;
        }

        public DatabaseBuilder setDatabaseType(DatabaseType databaseType) {
            this.databaseType = databaseType;
            return this;
        }

        public DatabaseBuilder mySQL(){
            this.databaseType = DatabaseType.SQL;
            return this;
        }

        public Boolean NameValidate(){
            return !this.name.toLowerCase().contains("agrim");
        }

        public Database build(){
            if(this.NameValidate()){
                Database database = new Database();

                database.name         = this.name;
                database.databaseType = this.databaseType;
                database.userName     = this.userName;
                database.password     = this.password;
                database.port         = this.port;

                return database;
            }
            throw new IllegalArgumentException("The arguments are not correct");
        }
    }


}
