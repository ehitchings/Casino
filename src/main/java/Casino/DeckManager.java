package Casino;

import java.util.Random;

/**
 * Created by evanhitchings on 10/2/16.
 */
public class DeckManager {
    private Deck deck = new Deck();
    private Random random = new Random();



    public Deck getDeck() {
        return deck;
    }

    public Card drawCard(){
        int cardIndex = random.nextInt(deck.size());
        Card toReturn = deck.getCardDeck().get(cardIndex);
        deck.getCardDeck().remove(toReturn);
        return toReturn;

    }

    public void shuffleDeck(){
        Card[] tempDeck = this.deck.getCardDeck().toArray(new Card[this.deck.size()]);
        this.deck.getCardDeck().clear();
        while(tempDeck.length > this.deck.size()){
            int cardIndex = random.nextInt(tempDeck.length);
            this.deck.getCardDeck().add(tempDeck[cardIndex]);
        }

    }

    public String toString(){
        return this.deck.toString();
    }

}
