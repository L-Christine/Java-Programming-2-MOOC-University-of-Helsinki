import java.util.*;

public class Hand implements Comparable<Hand> {
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        cards.stream().forEach(card -> {System.out.println(card);});
    }
    
    public void sort() {
        Collections.sort(cards);
    }
    
    public int sumUp() {
        int sum = 0;
        for (Card card : this.cards) {
            sum += card.getValue();
        }
        return sum;
    }

    @Override
    public int compareTo(Hand hand) {
        return sumUp() - hand.sumUp();
    }

    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
}
