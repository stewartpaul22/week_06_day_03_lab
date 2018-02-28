import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;
    private Card card;

    @Before
    public void before() {
        deck = new Deck();
        card = new Card(SuitType.HEARTS, ValueType.QUEEN);
    }

    @Test
    public void canGetCardCount__deckEmpty() {
        assertEquals(0, deck.getCardCount());
    }

    @Test
    public void canAddCard() {
        deck.addCard(card);
        assertEquals(1, deck.getCardCount());
    }

    @Test
    public void canPopulateDeck() {
        deck.populate();
        assertEquals(52, deck.getCardCount());
    }

    @Test
    public void canDealCard() {
        deck.populate();
        deck.dealCard();
        assertEquals(51, deck.getCardCount());
    }

    @Test
    public void canDealAllCards() {
        deck.populate();
        int deckCount = deck.getCardCount();
        for(int i = 1; i < deckCount; i++){
            deck.dealCard();
        }
        assertEquals(0, deck.getCardCount());
    }

}
