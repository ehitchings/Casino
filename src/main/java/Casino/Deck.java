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

    public void fillDeck(){
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

    public void shuffleDeck(){
        Card[] tempDeck = this.cardDeck.toArray(new Card[this.cardDeck.size()]);
        this.cardDeck.clear();
        while(tempDeck.length > this.cardDeck.size()){
            int cardIndex = random.nextInt(tempDeck.length);
            this.cardDeck.add(tempDeck[cardIndex]);
        }

    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Card card : this.cardDeck){
            sb.append(card.toString() + "\n");
        }
        return sb.toString();

    }

    public Card drawCard(){
        int cardIndex = random.nextInt(this.size());
        Card toReturn = this.cardDeck.get(cardIndex);
        this.cardDeck.remove(toReturn);
        return toReturn;

    }


}
