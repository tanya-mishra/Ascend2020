package service.connection;

/**
 * Connection to database
 */
public interface Connection {

    //Connect to db
    void connect();

    //Write to db
    void write(String data);

    //Disconnect from db
    void disconnect();
}
