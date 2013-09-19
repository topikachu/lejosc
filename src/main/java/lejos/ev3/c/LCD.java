package lejos.ev3.c;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : lms2012.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class LCD extends Structure {
	/** C type : UBYTE[(((178 + 7) / 8) * 128)] */
	public byte[] Lcd = new byte[((178 + 7) / 8) * 128];
	public byte[] getLcd() {
		return Lcd;
	}
	public void setLcd(byte Lcd[]) {
		this.Lcd = Lcd;
	}
	public LCD() {
		super();
	}
	public LCD(Pointer address) {
		super(address);
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("Lcd");
	}
	/** @param Lcd C type : UBYTE[(((178 + 7) / 8) * 128)] */
	public LCD(byte Lcd[]) {
		super();
		if ((Lcd.length != this.Lcd.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.Lcd = Lcd;
	}
	public static class ByReference extends LCD implements Structure.ByReference {
		
	};
	public static class ByValue extends LCD implements Structure.ByValue {
		
	};
}