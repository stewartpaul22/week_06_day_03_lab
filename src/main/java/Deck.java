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
        this.cards.remove(card);
        return card;
    }

    private Card getRandomCard() {
        Random random = new Random();
        int index = random.nextInt(52);

        Card card = this.cards.get(index);
        return card;
    }
}
