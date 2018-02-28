import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card card;

    @Before
    public void before() {
        card = new Card(SuitType.HEARTS, ValueType.QUEEN);
    }

    @Test
    public void canGetSuit() {
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetValue() {
        assertEquals(ValueType.QUEEN, card.getValue());
    }

    @Test
    public void queenHasValue10() {
        assertEquals(10, card.getValueFromEnum());
    }

    @Test
    public void canGetAllSuits() {
        SuitType[] expected = {SuitType.HEARTS, SuitType.DIAMONDS, SuitType.SPADES, SuitType.CLUBS};
        SuitType[] suits = SuitType.values();
        assertEquals(4, suits.length);
        assertArrayEquals(expected, suits);
    }

}
