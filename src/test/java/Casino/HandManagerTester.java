package Casino;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by evanhitchings on 10/2/16.
 */
public class HandManagerTester {

    @Test
    public void handTest(){

        HandManager hm = new HandManager();
        Hand hand = new Hand();
        hm.getHandSet().add(hand);
        Card aceOfSpades = new Card(1, 2);
        Card kingOfHearts = new Card(13, 1);
        hm.add(aceOfSpades, hand);
        hm.add(kingOfHearts, hand);
        Assert.assertTrue("Hand did not contain the Ace of Spades", hm.getHand(hand).getCardsInHand().contains(aceOfSpades));
        Assert.assertTrue("Hand did not contain the King of Hearts", hm.getHand(hand).getCardsInHand().contains(kingOfHearts));
        Assert.assertEquals("Hand size was incorrect", 2, hm.getHand(hand).getCardsInHand().size());
        System.out.println(hm.getHand(hand));
    }

}
