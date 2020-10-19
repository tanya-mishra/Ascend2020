package service.gamePlay;

import domain.players.Player;

/**
 * Class to display the status of the game
 */
public class GameDisplay {

    Player player1;

    Player player2;

    /**
     * Display the players for the game
     *
     * @param player1
     * @param player2
     * @param move
     */
    public void update(Player player1, Player player2, String move) {
        this.player1 = player1;
        this.player2 = player2;

        String result = "";

        //If one player has zero health, the other player wins
        if (player1.getHealth() <= 0) {
            result = "\nGAME OVER ! \n" + player2.makeVictoryMove();
        } else if (player2.getHealth() <= 0) {
            result = "\nGAME OVER ! \n" + player1.makeVictoryMove();
        /*
        If both players have no possible moves, compare the health of the players.
        If health is also equal, we compare the energy.
         */
        } else if (player1.getAvailableAttacks().size() == 0 && player2.getAvailableAttacks().size() == 0) {
            Player winner = player1.getHealth() > player2.getHealth() ||
                    (player1.getHealth().equals(player2.getHealth()) && player1.getEnergy() > player2.getEnergy())
                    ? player1 : player2;
            result = "No moves possible for either player! \n\nGAME OVER ! \n" + winner.makeVictoryMove();
        }
        display(move, result);
    }

    /**
     * Print the status of the game
     *
     * @param move
     * @param result
     */
    public void display(String move, String result) {
        System.out.println(move);
        System.out.println("\t\t\t\t" + player1.toString() + "\n\t\t\t\t" + player2.toString() + "\n");
        if (result.length() > 0) System.out.println(result);
    }

}
