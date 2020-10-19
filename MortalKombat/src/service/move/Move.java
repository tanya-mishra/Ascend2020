package service.move;

import domain.players.Player;

import java.util.List;

public interface Move {

    String makeMove(List<Player> players);

    Boolean isGameOver(List<Player> players);

}
