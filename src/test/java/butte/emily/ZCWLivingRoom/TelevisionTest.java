package butte.emily.ZCWLivingRoom;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by emilybutte on 9/9/16.
 */
public class TelevisionTest {

    @Test
    public void getVolumeTest(){
        Television television = new Television();

        Integer expectedValue = 0;

        Integer actualValue = television.getVolume();

        Assert.assertEquals("The value should be 0",expectedValue,actualValue);
    }
}


