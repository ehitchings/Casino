package Casino;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by evanhitchings on 10/2/16.
 */
public class BlackjackHandManagerTester {

    @Test
    public void numberOfAcesTester(){
        BlackjackHand hand = new BlackjackHand();
        BlackjackHandManager bm = new BlackjackHandManager();
        Card aceOfSpades = new Card(1, 2);
        Card kingOfHearts = new Card(13, 1);
        bm.getHandSet().add(hand);
        Assert.assertEquals("Did not show 0 aces in hand", 0, bm.numberOfAces(hand));
        hand.getCardsInHand().add(aceOfSpades);
        hand.getCardsInHand().add(kingOfHearts);
        Assert.assertEquals("Did not show 1 ace in hand", 1, bm.numberOfAces(hand));
        hand.getCardsInHand().add(aceOfSpades);
        Assert.assertEquals("Did not show 2 aces in hand", 2, bm.numberOfAces(hand));
        System.out.println(hand);
    }

    @Test
    public void handValueTester(){
        BlackjackHand hand = new BlackjackHand();
        BlackjackHandManager bm = new BlackjackHandManager();
        bm.getHandSet().add(hand);
        Card aceOfSpades = new Card(1, 2);
        Card kingOfHearts = new Card(13, 1);
        bm.add(aceOfSpades, hand);
        bm.add(kingOfHearts, hand);
        Assert.assertEquals("Hand Value was not 21", 21, bm.handValue(hand));
        bm.add(kingOfHearts, hand);
        Assert.assertEquals("Single Ace did not reduce to 1 when needed", 21, bm.handValue(hand));
        bm.removeAll(hand);
        bm.add(aceOfSpades, hand);
        bm.add(aceOfSpades, hand);
        Assert.assertEquals("Value was not 12 with 2 aces", 12, bm.handValue(hand));
        bm.add(kingOfHearts, hand);
        Assert.assertEquals("Second ace did not reduce when total exceeded 21", 12, bm.handValue(hand));

    }
}
