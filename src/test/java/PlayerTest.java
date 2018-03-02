import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player1;
    private Hand hand;
    private Deck deck;

    @Before
    public void before() {
        player1 = new Player("Kelly");
        hand = new Hand();
        deck = new Deck();
    }

    @Test
    public void playerHasName() {
        assertEquals("Kelly", player1.getName());
    }

    @Test
    public void playerHasHand () {
        deck.populate();
        player1.getHand().addCard(deck);
        assertEquals(1, player1.getHand().getCardCount());
    }

}
