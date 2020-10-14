package service.gamePlay;

import service.connection.Connection;
import service.connection.DatabaseConnection;

public class GameSaver {

    Connection connection;

    public GameSaver() {
        this.connection = new DatabaseConnection();
    }

    public void saveGame(GameStatus gameStatus) {
        connection.connect();
        connection.write(gameStatus.toString());
        connection.disconnect();
    }
}
