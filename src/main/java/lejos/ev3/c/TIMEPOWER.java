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
public class TIMEPOWER extends Structure {
	/** C type : DATA8 */
	public byte Cmd;
	public byte getCmd() {
		return Cmd;
	}
	public void setCmd(byte Cmd) {
		this.Cmd = Cmd;
	}
	/** C type : DATA8 */
	public byte Nos;
	public byte getNos() {
		return Nos;
	}
	public void setNos(byte Nos) {
		this.Nos = Nos;
	}
	/** C type : DATA8 */
	public byte Power;
	public byte getPower() {
		return Power;
	}
	public void setPower(byte Power) {
		this.Power = Power;
	}
	/** C type : DATA32 */
	public int Time1;
	public int getTime1() {
		return Time1;
	}
	public void setTime1(int Time1) {
		this.Time1 = Time1;
	}
	/** C type : DATA32 */
	public int Time2;
	public int getTime2() {
		return Time2;
	}
	public void setTime2(int Time2) {
		this.Time2 = Time2;
	}
	/** C type : DATA32 */
	public int Time3;
	public int getTime3() {
		return Time3;
	}
	public void setTime3(int Time3) {
		this.Time3 = Time3;
	}
	/** C type : DATA8 */
	public byte Brake;
	public byte getBrake() {
		return Brake;
	}
	public void setBrake(byte Brake) {
		this.Brake = Brake;
	}
	public TIMEPOWER() {
		super();
	}
	public TIMEPOWER(Pointer peer) {
		super(peer);
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("Cmd", "Nos", "Power", "Time1", "Time2", "Time3", "Brake");
	}
	/**
	 * @param Cmd C type : DATA8<br>
	 * @param Nos C type : DATA8<br>
	 * @param Power C type : DATA8<br>
	 * @param Time1 C type : DATA32<br>
	 * @param Time2 C type : DATA32<br>
	 * @param Time3 C type : DATA32<br>
	 * @param Brake C type : DATA8
	 */
	public TIMEPOWER(byte Cmd, byte Nos, byte Power, int Time1, int Time2, int Time3, byte Brake) {
		super();
		this.Cmd = Cmd;
		this.Nos = Nos;
		this.Power = Power;
		this.Time1 = Time1;
		this.Time2 = Time2;
		this.Time3 = Time3;
		this.Brake = Brake;
	}
	public static class ByReference extends TIMEPOWER implements Structure.ByReference {
		
	};
	public static class ByValue extends TIMEPOWER implements Structure.ByValue {
		
	};
}
