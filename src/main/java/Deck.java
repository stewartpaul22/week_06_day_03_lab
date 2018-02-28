import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public int getCardCount() {
        return this.cards.size();
    }

    public Card addCard(Card card) {
        this.cards.add(card);
        return card;
    }
}
