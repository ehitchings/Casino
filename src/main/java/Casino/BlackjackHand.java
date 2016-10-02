package Casino;

/**
 * Created by evanhitchings on 10/2/16.
 */
public class BlackjackHand extends Hand {

    public int handValue(){
        int valueToReturn = 0;
        int acesCurrentlyWorth11 = this.numberOfAces();
        for(Card card : this.getCardsInHand()){
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

    public int numberOfAces(){
        int toReturn =0;
        for(Card card : this.getCardsInHand()){
            if (card.getValue() == 1){
                toReturn++;
            }
        }
        return toReturn;
    }

    public String toString(){
        String toReturn = super.toString();
        toReturn += "\nCurrent Value: " + this.handValue();
        return toReturn;
    }

}
