package Casino;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by evanhitchings on 10/2/16.
 */
public class Hand {
    private List<Card> cardsInHand;

    public Hand() {
        this.cardsInHand = new LinkedList<Card>();
    }

    public void add(Card card){
        this.cardsInHand.add(card);
    }

    public void remove(Card card){
        this.cardsInHand.remove(card);
    }

    public void removeAll(){
        this.cardsInHand.clear();
    }



    public List<Card> getCardsInHand() {
        return cardsInHand;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Card card : this.cardsInHand){
            sb.append(card + "\t");
        }
        return sb.toString();
    }
}
