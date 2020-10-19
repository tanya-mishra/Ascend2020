package service.move;

import domain.players.Player;

import java.util.List;

/**
 * Interface for moves in the game
 */
public interface Move {

    /**
     * Make a move with both players
     *
     * @param players
     * @return
     */
    String makeMove(List<Player> players);

    /**
     * Check if the game is over
     *
     * @param players
     * @return
     */
    Boolean isGameOver(List<Player> players);

}
