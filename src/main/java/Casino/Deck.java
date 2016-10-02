package Casino;

import java.util.List;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by evanhitchings on 10/2/16.
 */
public class Deck {
    private List<Card> cardDeck;
    private Random random;


    public Deck(){
        this.cardDeck = new LinkedList<Card>();
        fillDeck();
        this.random = new Random();
    }

    private void fillDeck(){
      for(int cardValue = 1; cardValue <= 13; cardValue++){
          for(int cardSuit = 1; cardSuit <= 4; cardSuit++){
              cardDeck.add(new Card(cardValue, cardSuit));
          }
      }
    }

    public List<Card> getCardDeck() {
        return cardDeck;
    }

    public int size(){
        return this.cardDeck.size();
    }



    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Card card : this.cardDeck){
            sb.append(card.toString() + "\n");
        }
        return sb.toString();

    }



}
