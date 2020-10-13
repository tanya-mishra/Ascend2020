package service.gamePlay;

import domain.players.Player;

public class GamePlayMonitor {

    Player player1;

    Player player2;

    public void update(Player player1, Player player2, String move) {
        this.player1 = player1;
        this.player2 = player2;

        String result = "";

        if (player1.getHealth() <= 0) {
            result = "GAME OVER ! " + player2.makeVictoryMove();
        } else if (player2.getHealth() <= 0) {
            result = "GAME OVER ! " + player1.makeVictoryMove();
        } else if (player1.getAvailableAttacks().size() == 0 && player2.getAvailableAttacks().size() == 0) {
            Player winner = player1.getHealth() > player2.getHealth() ||
                    (player1.getHealth().equals(player2.getHealth()) && player1.getEnergy() > player2.getEnergy())
                    ? player1 : player2;
            result = "No moves possible for either player! \n GAME OVER ! " + winner.makeVictoryMove();
        }
        display(move, result);
    }

    public void display(String move, String result) {
        System.out.println(move);
        System.out.println(player1.toString() + "::" + player2.toString());
        if (result.length() > 0) System.out.println(result);
    }

}
