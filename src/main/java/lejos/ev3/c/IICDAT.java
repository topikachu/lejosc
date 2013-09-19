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
public class IICDAT extends Structure {
	/**
	 * @see RESULT<br>
	 * C type : RESULT
	 */
	public int Result;
	public int getResult() {
		return Result;
	}
	public void setResult(int Result) {
		this.Result = Result;
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
	public byte Repeat;
	public byte getRepeat() {
		return Repeat;
	}
	public void setRepeat(byte Repeat) {
		this.Repeat = Repeat;
	}
	/** C type : DATA16 */
	public short Time;
	public short getTime() {
		return Time;
	}
	public void setTime(short Time) {
		this.Time = Time;
	}
	/** C type : DATA8 */
	public byte WrLng;
	public byte getWrLng() {
		return WrLng;
	}
	public void setWrLng(byte WrLng) {
		this.WrLng = WrLng;
	}
	/** C type : DATA8[32] */
	public byte[] WrData = new byte[32];
	public byte[] getWrData() {
		return WrData;
	}
	public void setWrData(byte WrData[]) {
		this.WrData = WrData;
	}
	/** C type : DATA8 */
	public byte RdLng;
	public byte getRdLng() {
		return RdLng;
	}
	public void setRdLng(byte RdLng) {
		this.RdLng = RdLng;
	}
	/** C type : DATA8[32] */
	public byte[] RdData = new byte[32];
	public byte[] getRdData() {
		return RdData;
	}
	public void setRdData(byte RdData[]) {
		this.RdData = RdData;
	}
	public IICDAT() {
		super();
	}
	public IICDAT(Pointer address) {
		super(address);
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("Result", "Port", "Repeat", "Time", "WrLng", "WrData", "RdLng", "RdData");
	}
	/**
	 * @param Result @see RESULT<br>
	 * C type : RESULT<br>
	 * @param Port C type : DATA8<br>
	 * @param Repeat C type : DATA8<br>
	 * @param Time C type : DATA16<br>
	 * @param WrLng C type : DATA8<br>
	 * @param WrData C type : DATA8[32]<br>
	 * @param RdLng C type : DATA8<br>
	 * @param RdData C type : DATA8[32]
	 */
	public IICDAT(int Result, byte Port, byte Repeat, short Time, byte WrLng, byte WrData[], byte RdLng, byte RdData[]) {
		super();
		this.Result = Result;
		this.Port = Port;
		this.Repeat = Repeat;
		this.Time = Time;
		this.WrLng = WrLng;
		if ((WrData.length != this.WrData.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.WrData = WrData;
		this.RdLng = RdLng;
		if ((RdData.length != this.RdData.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.RdData = RdData;
	}
	public static class ByReference extends IICDAT implements Structure.ByReference {
		
	};
	public static class ByValue extends IICDAT implements Structure.ByValue {
		
	};
}