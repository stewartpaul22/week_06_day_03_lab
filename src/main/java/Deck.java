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


    public void populate() {
        for(SuitType suit : SuitType.values()) {
            for(ValueType faceValue : ValueType.values()) {
                Card card = new Card(suit, faceValue);
                this.cards.add(card);
//                System.out.println(card.getValue() + " of " + card.getSuit());
            }
        }

    }
}
