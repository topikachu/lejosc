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
public class DEVCON extends Structure {
	/** C type : DATA8[4] */
	public byte[] Connection = new byte[4];
	public byte[] getConnection() {
		return Connection;
	}
	public void setConnection(byte Connection[]) {
		this.Connection = Connection;
	}
	/** C type : DATA8[4] */
	public byte[] Type = new byte[4];
	public byte[] getType() {
		return Type;
	}
	public void setType(byte Type[]) {
		this.Type = Type;
	}
	/** C type : DATA8[4] */
	public byte[] Mode = new byte[4];
	public byte[] getMode() {
		return Mode;
	}
	public void setMode(byte Mode[]) {
		this.Mode = Mode;
	}
	public DEVCON() {
		super();
	}
	public DEVCON(Pointer address) {
		super(address);
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("Connection", "Type", "Mode");
	}
	/**
	 * @param Connection C type : DATA8[4]<br>
	 * @param Type C type : DATA8[4]<br>
	 * @param Mode C type : DATA8[4]
	 */
	public DEVCON(byte Connection[], byte Type[], byte Mode[]) {
		super();
		if ((Connection.length != this.Connection.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.Connection = Connection;
		if ((Type.length != this.Type.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.Type = Type;
		if ((Mode.length != this.Mode.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.Mode = Mode;
	}
	public static class ByReference extends DEVCON implements Structure.ByReference {
		
	};
	public static class ByValue extends DEVCON implements Structure.ByValue {
		
	};
}