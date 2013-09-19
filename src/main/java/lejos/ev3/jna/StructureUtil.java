package lejos.ev3.jna;

import com.sun.jna.Structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: gongy
 * Date: 9/19/13
 * Time: 12:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class StructureUtil {
    static public int sizeof(Class<? extends Structure> clazz){
        try {

            //calculateSize(boolean force, boolean avoidFFIType)
            Method calculateSizeMethod = Structure.class.getDeclaredMethod("size", Class.class);
            calculateSizeMethod.setAccessible(true);
            return (Integer) calculateSizeMethod.invoke(null,clazz);
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NoSuchMethodException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (InvocationTargetException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return 0;
    }
}
