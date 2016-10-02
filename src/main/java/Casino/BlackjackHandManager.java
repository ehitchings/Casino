package Casino;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by evanhitchings on 10/2/16.
 */
public class BlackjackHandManager extends HandManager {



    public int handValue(BlackjackHand hand){
        int valueToReturn = 0;
        int acesCurrentlyWorth11 = this.numberOfAces(hand);
        for(Card card : this.getHand(hand).getCardsInHand()){
            if(card.getValue() >= 10){
                valueToReturn += 10;
            } else if (card.getValue() >= 2){
                valueToReturn += card.getValue();
            } else {
                valueToReturn += 11;
            }
        }
        if(valueToReturn > 21){
            while(acesCurrentlyWorth11 > 0 && valueToReturn > 21){
                acesCurrentlyWorth11 --;
                valueToReturn -= 10;
            }
        }
        return valueToReturn;
    }

    public int numberOfAces(Hand hand){
        int toReturn =0;
        for(Card card : this.getHand(hand).getCardsInHand()){
            if (card.getValue() == 1){
                toReturn++;
            }
        }
        return toReturn;
    }




}
