package Casino;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by evanhitchings on 10/2/16.
 */
public class BlackjackHandTester {

    @Test
    public void numberOfAcesTester(){
        BlackjackHand hand = new BlackjackHand();
        Card aceOfSpades = new Card(1, 2);
        Card kingOfHearts = new Card(13, 1);
        Assert.assertEquals("Did not show 0 aces in hand", 0, hand.numberOfAces());
        hand.getCardsInHand().add(aceOfSpades);
        hand.getCardsInHand().add(kingOfHearts);
        Assert.assertEquals("Did not show 1 ace in hand", 1, hand.numberOfAces());
        hand.getCardsInHand().add(aceOfSpades);
        Assert.assertEquals("Did not show 2 aces in hand", 2, hand.numberOfAces());
        System.out.println(hand);
    }

    @Test
    public void handValueTester(){
        BlackjackHand hand = new BlackjackHand();
        Card aceOfSpades = new Card(1, 2);
        Card kingOfHearts = new Card(13, 1);
        hand.getCardsInHand().add(aceOfSpades);
        hand.getCardsInHand().add(kingOfHearts);
        Assert.assertEquals("Hand Value was not 21", 21, hand.handValue());
        hand.add(kingOfHearts);
        Assert.assertEquals("Single Ace did not reduce to 1 when needed", 21, hand.handValue());
        hand.removeAll();
        hand.add(aceOfSpades);
        hand.add(aceOfSpades);
        Assert.assertEquals("Value was not 12 with 2 aces", 12, hand.handValue());
        hand.add(kingOfHearts);
        Assert.assertEquals("Second ace did not reduce when total exceeded 21", 12, hand.handValue());

    }
}
