package service.gamePlay;

import service.connection.Connection;
import service.connection.DatabaseConnection;

/**
 * Game saver class to save the game status
 */
public class GameSaver {

    Connection connection;

    public GameSaver() {
        this.connection = new DatabaseConnection();
    }

    /**
     * Save game status
     *
     * @param gameStatus
     */
    public void saveGame(GameStatus gameStatus) {
        connection.connect();
        connection.write(gameStatus.toString());
        connection.disconnect();
    }
}
