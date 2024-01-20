package singleton;

public class Database {
    private static Database dbInstance;

    private Database() {
        System.out.println("New DB Instance created");;
    }

    public static Database getConnection() {
        if (dbInstance == null) {
            dbInstance = new Database();
        }
        return dbInstance;
    }


    public void disconnect() {
        System.out.println("DB disconnected");
    }
}
