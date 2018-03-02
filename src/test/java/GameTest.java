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
        deck.populate();
        game = new Game(players);
    }

    @Test
    public void gameHasPlayers() {
        assertEquals(2, players.size());
    }

    @Test
    public void canDealOneCardToEachPlayer() {
        player1.getHand().addCard(deck);
        player2.getHand().addCard(deck);
        assertEquals(1, player1.getCardCount());
        assertEquals(1, player2.getCardCount());
    }

    @Test
    public void checkGameOutcome__draw() {
        Card card1 = new Card(SuitType.HEARTS, ValueType.EIGHT);
        Card card2 = new Card(SuitType.SPADES, ValueType.EIGHT);
        player1.getHand().addTestCard(card1);
        player2.getHand().addTestCard(card2);
        String result = game.checkOutcome(player1.getHand(), player2.getHand());
        assertEquals("It's a draw!", result);
    }

    @Test
    public void checkGameOutcome__player1Wins() {
        Card card1 = new Card(SuitType.HEARTS, ValueType.NINE);
        Card card2 = new Card(SuitType.SPADES, ValueType.EIGHT);
        player1.getHand().addTestCard(card1);
        player2.getHand().addTestCard(card2);
        String result = game.checkOutcome(player1.getHand(), player2.getHand());
        assertEquals("Chuck Wins!", result);
    }

    @Test
    public void checkGameOutcome__player2Wins() {
        Card card1 = new Card(SuitType.HEARTS, ValueType.NINE);
        Card card2 = new Card(SuitType.SPADES, ValueType.KING);
        player1.getHand().addTestCard(card1);
        player2.getHand().addTestCard(card2);
        String result = game.checkOutcome(player1.getHand(), player2.getHand());
        assertEquals("Bruce Wins!", result);
    }

}
