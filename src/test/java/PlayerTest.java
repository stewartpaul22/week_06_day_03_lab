import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player1;
    private Deck deck;

    @Before
    public void before() {
        player1 = new Player("Kelly");
        deck = new Deck();
        deck.populate();
    }

    @Test
    public void playerHasName() {
        assertEquals("Kelly", player1.getName());
    }

    @Test
    public void getPlayerCardCount() {
        player1.getHand().addCard(deck);
        assertEquals(1, player1.getCardCount());
    }

    @Test
    public void playerHasHand () {
        player1.getHand().addCard(deck);
        assertEquals(1, player1.getCardCount());
    }

}
