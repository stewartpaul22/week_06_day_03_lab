import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;
    private Deck deck;
    private Player player1;
    private Player player2;
    private ArrayList<Player> players;

    @Before
    public void before() {
        player1 = new Player("Chuck");
        player2 = new Player("Bruce");
        players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        deck = new Deck();
        game = new Game(players);
    }

    @Test
    public void gameHasPlayers() {
        assertEquals(2, players.size());
    }

    @Test
    public void canDealOneCardToEachPlayer() {

    }

}
