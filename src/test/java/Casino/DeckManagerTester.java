package Casino;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by evanhitchings on 10/2/16.
 */
public class DeckManagerTester {

    @Test
    public void createDeckTester(){
        DeckManager dm = new DeckManager();
        Assert.assertEquals("Deck was not filled properly", 52, dm.getDeck().size());
        System.out.println(dm.getDeck());
    }

    @Test
    public void shuffleDeckTester(){
        DeckManager dmToShuffle = new DeckManager();

        DeckManager controlDeck = new DeckManager();
        dmToShuffle.shuffleDeck();
        Assert.assertNotEquals("The decks were still identical after shuffling", controlDeck, dmToShuffle);
        System.out.println(dmToShuffle);
        Assert.assertEquals("The decks did not remain the same size", controlDeck.getDeck().size(), dmToShuffle.getDeck().size());
    }

    @Test
    public void drawCardTester(){
        DeckManager dm = new DeckManager();
        Card card = dm.drawCard();
        Assert.assertEquals("Deck size did not decrease", 51, dm.getDeck().size());
        Assert.assertFalse("Card is still in deck after being drawn", dm.getDeck().getCardDeck().contains(card));
    }


}
