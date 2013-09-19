package lejos.ev3;
import junit.framework.Assert;
import lejos.ev3.c.ANALOG;
import lejos.ev3.jna.StructureUtil;
import org.junit.Test;
/**
 * Created with IntelliJ IDEA.
 * User: gongy
 * Date: 9/18/13
 * Time: 10:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class ANALOGTest {
    @Test
    public void testSize(){
        Assert.assertEquals(StructureUtil.sizeof(ANALOG.class),5172);



    }
}
