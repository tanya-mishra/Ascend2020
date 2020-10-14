package service.connection;

public interface Connection {

    void connect();

    void write(String data);

    void disconnect();
}
