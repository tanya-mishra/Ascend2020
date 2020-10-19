package service.connection;

/**
 * Implementation for SQL server connection
 */
public class DatabaseConnection implements Connection {

    //This method holds the logic for connecting to the database
    @Override
    public void connect() {
        System.out.println("Connected to database");
    }

    //This method holds the code for writing to the database
    @Override
    public void write(String data) {
        System.out.println("Writing " + data + "  to database");
    }

    //This method holds the code for disconnecting from the database
    @Override
    public void disconnect() {
        System.out.println("Disconnected from database");
    }
}
