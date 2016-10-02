package Casino;



/**
 * Created by evanhitchings on 10/2/16.
 */
public class Card {
    private final int value;
    private final Suit suit;


    public Card(int value, int suit){
        this.value = value;
        this.suit = makeSuit(suit);
    }

    private Suit makeSuit(int suit){
        switch(suit){
            case 1:
                return Suit.HEARTS;
            case 2:
                return Suit.SPADES;
            case 3:
                return Suit.CLUBS;
            case 4:
                return Suit.DIAMONDS;
            default:
                return Suit.HEARTS;

        }
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    public String toString(){
        String toReturn = "";
       switch (this.value){
           case 1:
               toReturn += "Ace";
               break;
           case 11:
               toReturn += "Jack";
               break;
           case 12:
               toReturn += "Queen";
               break;
           case 13:
               toReturn += "King";
               break;
           default:
               toReturn += this.value;
               break;
       }
       toReturn += " of " + this.suit.toString();
       return toReturn;

    }
}

enum Suit{HEARTS, SPADES, CLUBS, DIAMONDS}
