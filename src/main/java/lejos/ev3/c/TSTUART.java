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
public class TSTUART extends Structure {
	/** C type : DATA32 */
	public int Bitrate;
	public int getBitrate() {
		return Bitrate;
	}
	public void setBitrate(int Bitrate) {
		this.Bitrate = Bitrate;
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
	public byte Length;
	public byte getLength() {
		return Length;
	}
	public void setLength(byte Length) {
		this.Length = Length;
	}
	/** C type : DATA8[64] */
	public byte[] String = new byte[64];
	public byte[] getString() {
		return String;
	}
	public void setString(byte String[]) {
		this.String = String;
	}
	public TSTUART() {
		super();
	}
	public TSTUART(Pointer peer) {
		super(peer);
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("Bitrate", "Port", "Length", "String");
	}
	/**
	 * @param Bitrate C type : DATA32<br>
	 * @param Port C type : DATA8<br>
	 * @param Length C type : DATA8<br>
	 * @param String C type : DATA8[64]
	 */
	public TSTUART(int Bitrate, byte Port, byte Length, byte String[]) {
		super();
		this.Bitrate = Bitrate;
		this.Port = Port;
		this.Length = Length;
		if ((String.length != this.String.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.String = String;
	}
	public static class ByReference extends TSTUART implements Structure.ByReference {
		
	};
	public static class ByValue extends TSTUART implements Structure.ByValue {
		
	};
}
