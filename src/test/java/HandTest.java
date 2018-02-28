import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HandTest {

    private Hand hand;

    @Before
    public void before() {
        hand = new Hand();
    }

    @Test
    public void canGetCardCount__handEmpty() {
        assertEquals(0, hand.getCardCount());
    }

}
