import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;

    public Hand() {
        this.cards =  new ArrayList<>();
    }

    public int getCardCount() {
        return this.cards.size();
    }
}
