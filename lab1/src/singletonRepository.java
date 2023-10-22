public class singletonRepository {
    private static singletonRepository instance;
    private String DSN;

    private singletonRepository(String connection) {
       setDSN(connection);
    }

    private void setDSN(String connection) {
        this.DSN = connection;
    }

    public String getDSN() {
        return DSN;
    }

    public void pingDB() {
        if (instance != null) {
            System.out.println( "you have no connection do database!");
            return;
        }
        System.out.println( "Data Base is Alive!");
    }

    public static singletonRepository getInstance(String connection) {
        if (instance == null) {
            instance = new singletonRepository(connection);
        }

        if (connection != instance.DSN) {
            System.out.println("bad credentials");
            return null;
        }

        return instance;
    }
}
