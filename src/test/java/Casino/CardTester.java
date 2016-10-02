package Casino;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by evanhitchings on 10/2/16.
 */
public class CardTester {

    @Test
    public void cardConstructionTester(){
        Card cardKingHearts = new Card(13, 1);
        Assert.assertEquals("Card was not the King of Hearts", "King of HEARTS", cardKingHearts.toString());
    }
}
