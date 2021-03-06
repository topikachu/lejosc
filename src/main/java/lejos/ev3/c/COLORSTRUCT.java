package lejos.ev3.c;
import com.sun.jna.NativeLong;
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
public class COLORSTRUCT extends Structure {
	/** C type : ULONG[3][4] */
	public NativeLong[] Calibration = new NativeLong[((3) * (4))];
	public NativeLong[] getCalibration() {
		return Calibration;
	}
	public void setCalibration(NativeLong Calibration[]) {
		this.Calibration = Calibration;
	}
	/** C type : UWORD[3 - 1] */
	public short[] CalLimits = new short[3 - 1];
	public short[] getCalLimits() {
		return CalLimits;
	}
	public void setCalLimits(short CalLimits[]) {
		this.CalLimits = CalLimits;
	}
	/** C type : UWORD */
	public short Crc;
	public short getCrc() {
		return Crc;
	}
	public void setCrc(short Crc) {
		this.Crc = Crc;
	}
	/** C type : UWORD[4] */
	public short[] ADRaw = new short[4];
	public short[] getADRaw() {
		return ADRaw;
	}
	public void setADRaw(short ADRaw[]) {
		this.ADRaw = ADRaw;
	}
	/** C type : UWORD[4] */
	public short[] SensorRaw = new short[4];
	public short[] getSensorRaw() {
		return SensorRaw;
	}
	public void setSensorRaw(short SensorRaw[]) {
		this.SensorRaw = SensorRaw;
	}
	public COLORSTRUCT() {
		super();
	}
	public COLORSTRUCT(Pointer peer) {
		super(peer);
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("Calibration", "CalLimits", "Crc", "ADRaw", "SensorRaw");
	}
	/**
	 * @param Calibration C type : ULONG[3][4]<br>
	 * @param CalLimits C type : UWORD[3 - 1]<br>
	 * @param Crc C type : UWORD<br>
	 * @param ADRaw C type : UWORD[4]<br>
	 * @param SensorRaw C type : UWORD[4]
	 */
	public COLORSTRUCT(NativeLong Calibration[], short CalLimits[], short Crc, short ADRaw[], short SensorRaw[]) {
		super();
		if ((Calibration.length != this.Calibration.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.Calibration = Calibration;
		if ((CalLimits.length != this.CalLimits.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.CalLimits = CalLimits;
		this.Crc = Crc;
		if ((ADRaw.length != this.ADRaw.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ADRaw = ADRaw;
		if ((SensorRaw.length != this.SensorRaw.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.SensorRaw = SensorRaw;
	}
	public static class ByReference extends COLORSTRUCT implements Structure.ByReference {
		
	};
	public static class ByValue extends COLORSTRUCT implements Structure.ByValue {
		
	};
}
