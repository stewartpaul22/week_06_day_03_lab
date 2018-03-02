import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;

    public Hand() {
        this.cards =  new ArrayList<>();
    }

    public int getCardCount() {
        return this.cards.size();
    }

    public Card addCard(Deck deck) {
        Card card = deck.dealCard();
        this.cards.add(card);
        return card;
    }

    public ArrayList<Card> getAllCards() {
        return this.cards;
    }

    public int getTotalHandValue() {
        int total = 0;
        for(Card card : this.cards) {
            total += card.getValueFromEnum();
        }
        return total;
    }

    public void addTestCard(Card card) {
        this.cards.add(card);
    }
}
