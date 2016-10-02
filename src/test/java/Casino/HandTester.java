package Casino;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by evanhitchings on 10/2/16.
 */
public class HandTester {

    @Test
    public void handTest(){
        Hand hand = new Hand();
        Card aceOfSpades = new Card(1, 2);
        Card kingOfHearts = new Card(13, 1);
        hand.getCardsInHand().add(aceOfSpades);
        hand.getCardsInHand().add(kingOfHearts);
        Assert.assertTrue("Hand did not contain the Ace of Spades", hand.getCardsInHand().contains(aceOfSpades));
        Assert.assertTrue("Hand did not contain the King of Hearts", hand.getCardsInHand().contains(kingOfHearts));
        Assert.assertEquals("Hand size was incorrect", 2, hand.getCardsInHand().size());
        System.out.println(hand);
    }

}
