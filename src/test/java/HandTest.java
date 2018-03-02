import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HandTest {

    private Hand hand;
    private Deck deck;

    @Before
    public void before() {
        hand = new Hand();
        deck = new Deck();
    }

    @Test
    public void canGetCardCount__handEmpty() {
        assertEquals(0, hand.getCardCount());
    }

    @Test
    public void canCalculateTotal_handEmpty() {
        deck.populate();
        assertEquals(0, hand.getTotalHandValue());
    }

    @Test
    public void canAddCard() {
        deck.populate();
        hand.addCard(deck);
        assertEquals(1, hand.getCardCount());
    }

    @Test
    public void canCalculateHandTotal() {
        deck.populate();
        int card1Value = hand.addCard(deck).getValueFromEnum();
        int card2Value = hand.addCard(deck).getValueFromEnum();
        int totalValues = card1Value + card2Value;
        assertEquals(2, hand.getCardCount());
        int total = hand.getTotalHandValue();
        assertEquals(totalValues, total);
    }

}
