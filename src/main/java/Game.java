import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;

    public Game(ArrayList<Player> players) {
        this.players = players;
    }

    public String checkOutcome(Hand player1Hand, Hand player2Hand) {
        String result;
        if (player1Hand.getTotalHandValue() == player2Hand.getTotalHandValue()) {
            result = "It's a draw!";
        } else if ( player1Hand.getTotalHandValue() > player2Hand.getTotalHandValue()) {
            result = players.get(0).getName() + " Wins!";
        } else {
            result = players.get(1).getName() + " Wins!";
        }
        return result;
    }

}
