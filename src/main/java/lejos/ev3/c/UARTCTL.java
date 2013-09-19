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
public class UARTCTL extends Structure {
	/** C type : TYPES */
	public TYPES TypeData;
	public TYPES getTypeData() {
		return TypeData;
	}
	public void setTypeData(TYPES TypeData) {
		this.TypeData = TypeData;
	}
	/** C type : DATA8 */
	public byte Port;
	public byte getPort() {
		return Port;
	}
	public void setPort(byte Port) {
		this.Port = Port;
	}
	/** C type : DATA8 */
	public byte Mode;
	public byte getMode() {
		return Mode;
	}
	public void setMode(byte Mode) {
		this.Mode = Mode;
	}
	public UARTCTL() {
		super();
	}
	public UARTCTL(Pointer peer) {
		super(peer);
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("TypeData", "Port", "Mode");
	}
	/**
	 * @param TypeData C type : TYPES<br>
	 * @param Port C type : DATA8<br>
	 * @param Mode C type : DATA8
	 */
	public UARTCTL(TYPES TypeData, byte Port, byte Mode) {
		super();
		this.TypeData = TypeData;
		this.Port = Port;
		this.Mode = Mode;
	}
	public static class ByReference extends UARTCTL implements Structure.ByReference {
		
	};
	public static class ByValue extends UARTCTL implements Structure.ByValue {
		
	};
}
