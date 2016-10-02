package Casino;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by evanhitchings on 10/2/16.
 */
public class DeckTester {

    @Test
    public void createDeckTester(){
        Deck deck = new Deck();
        Assert.assertEquals("Deck was not filled properly", 52, deck.size());
        System.out.println(deck);
    }

    @Test
    public void shuffleDeckTester(){
        Deck deckToShuffle = new Deck();
        Deck controlDeck = new Deck();
        deckToShuffle.shuffleDeck();
        Assert.assertNotEquals("The decks were still identical after shuffling", controlDeck, deckToShuffle);
        System.out.println(deckToShuffle);
        Assert.assertEquals("The decks did not remain the same size", controlDeck.size(), deckToShuffle.size());
    }

    @Test
    public void drawCardTester(){
        Deck deck = new Deck();
        Card card = deck.drawCard();
        Assert.assertEquals("Deck size did not decrease", 51, deck.size());
        Assert.assertFalse("Card is still in deck after being drawn", deck.getCardDeck().contains(card));
    }


}
