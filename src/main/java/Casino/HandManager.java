package Casino;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by evanhitchings on 10/2/16.
 */
public class HandManager {
    private Set<Hand> handSet;


    public HandManager(){
        this.handSet = new LinkedHashSet<Hand>();
    }

    public Set<Hand> getHandSet() {
        return handSet;
    }

    public Hand getHand(Hand hand) {
        if(this.handSet.contains(hand)){
            return hand;
        }
        return null;
    }

    public void add(Card card, Hand hand){
        hand.getCardsInHand().add(card);
    }


    public void remove(Card card, Hand hand){
        hand.getCardsInHand().remove(card);
    }

    public void removeAll(Hand hand){
        hand.getCardsInHand().clear();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Hand hand : this.getHandSet()){
            sb.append(hand.toString());
        }
        return sb.toString();
    }






}
