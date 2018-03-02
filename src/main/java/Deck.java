import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public int getCardCount() {
        return this.cards.size();
    }

    public ArrayList<Card> getCards() {
        ArrayList<Card> cards = this.cards;
        return cards;
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
            }
        }
    }

    public Card dealCard() {
        Card card = this.getRandomCard();
        int index = cards.indexOf(card);
        return this.cards.remove(index);
    }

    private Card getRandomCard() {
        Card card = null;
        int remainingCardCount = this.getCardCount();
        if (remainingCardCount > 0) {
            Random random = new Random();
            int index = random.nextInt(remainingCardCount);

            card = this.cards.get(index);
        }
        return card;
    }

    public int getTotalDeckValue() {
        int total = 0;
        for(Card card : cards) {
            total += card.getValueFromEnum();
        }
        return total;
    }
}
