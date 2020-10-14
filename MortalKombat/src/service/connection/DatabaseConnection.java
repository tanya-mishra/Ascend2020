package service.connection;

public class DatabaseConnection implements Connection {
    @Override
    public void connect() {
        //This method holds the logic for connecting to the database
        System.out.println("Connected to database");
    }

    @Override
    public void write(String data) {
        //This method holds the code for writing to the database
        System.out.println("Writing " + data + "  to database");
    }

    @Override
    public void disconnect() {
        //This method holds the code for disconnecting from the database
        System.out.println("Disconnected from database");
    }
}
