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
public class ANALOG extends Structure {
	/**
	 * !< Analog value at input port connection 1<br>
	 * C type : DATA16[4]
	 */
	public short[] InPin1 = new short[4];
	public short[] getInPin1() {
		return InPin1;
	}
	public void setInPin1(short InPin1[]) {
		this.InPin1 = InPin1;
	}
	/**
	 * !< Analog value at input port connection 6<br>
	 * C type : DATA16[4]
	 */
	public short[] InPin6 = new short[4];
	public short[] getInPin6() {
		return InPin6;
	}
	public void setInPin6(short InPin6[]) {
		this.InPin6 = InPin6;
	}
	/**
	 * !< Analog value at output port connection 5<br>
	 * C type : DATA16[4]
	 */
	public short[] OutPin5 = new short[4];
	public short[] getOutPin5() {
		return OutPin5;
	}
	public void setOutPin5(short OutPin5[]) {
		this.OutPin5 = OutPin5;
	}
	/**
	 * !< Battery temperature<br>
	 * C type : DATA16
	 */
	public short BatteryTemp;
	public short getBatteryTemp() {
		return BatteryTemp;
	}
	public void setBatteryTemp(short BatteryTemp) {
		this.BatteryTemp = BatteryTemp;
	}
	/**
	 * !< Current flowing to motors<br>
	 * C type : DATA16
	 */
	public short MotorCurrent;
	public short getMotorCurrent() {
		return MotorCurrent;
	}
	public void setMotorCurrent(short MotorCurrent) {
		this.MotorCurrent = MotorCurrent;
	}
	/**
	 * !< Current flowing from the battery<br>
	 * C type : DATA16
	 */
	public short BatteryCurrent;
	public short getBatteryCurrent() {
		return BatteryCurrent;
	}
	public void setBatteryCurrent(short BatteryCurrent) {
		this.BatteryCurrent = BatteryCurrent;
	}
	/**
	 * !< Voltage at battery cell 1, 2, 3,4, 5, and 6<br>
	 * C type : DATA16
	 */
	public short Cell123456;
	public short getCell123456() {
		return Cell123456;
	}
	public void setCell123456(short Cell123456) {
		this.Cell123456 = Cell123456;
	}
	/**
	 * !< Raw value from analog device<br>
	 * C type : DATA16[4][300]
	 */
	public short[] Pin1 = new short[((4) * (300))];
	public short[] getPin1() {
		return Pin1;
	}
	public void setPin1(short Pin1[]) {
		this.Pin1 = Pin1;
	}
	/**
	 * !< Raw value from analog device<br>
	 * C type : DATA16[4][300]
	 */
	public short[] Pin6 = new short[((4) * (300))];
	public short[] getPin6() {
		return Pin6;
	}
	public void setPin6(short Pin6[]) {
		this.Pin6 = Pin6;
	}
	/** C type : UWORD[4] */
	public short[] Actual = new short[4];
	public short[] getActual() {
		return Actual;
	}
	public void setActual(short Actual[]) {
		this.Actual = Actual;
	}
	/** C type : UWORD[4] */
	public short[] LogIn = new short[4];
	public short[] getLogIn() {
		return LogIn;
	}
	public void setLogIn(short LogIn[]) {
		this.LogIn = LogIn;
	}
	/** C type : UWORD[4] */
	public short[] LogOut = new short[4];
	public short[] getLogOut() {
		return LogOut;
	}
	public void setLogOut(short LogOut[]) {
		this.LogOut = LogOut;
	}
	/** C type : COLORSTRUCT[4] */
	public COLORSTRUCT[] NxtCol = new COLORSTRUCT[4];
	public COLORSTRUCT[] getNxtCol() {
		return NxtCol;
	}
	public void setNxtCol(COLORSTRUCT NxtCol[]) {
		this.NxtCol = NxtCol;
	}
	/**
	 * !< Analog value at output port connection 5 when connection 6 is low<br>
	 * C type : DATA16[4]
	 */
	public short[] OutPin5Low = new short[4];
	public short[] getOutPin5Low() {
		return OutPin5Low;
	}
	public void setOutPin5Low(short OutPin5Low[]) {
		this.OutPin5Low = OutPin5Low;
	}
	/** C type : DATA8[4] */
	public byte[] Updated = new byte[4];
	public byte[] getUpdated() {
		return Updated;
	}
	public void setUpdated(byte Updated[]) {
		this.Updated = Updated;
	}
	/**
	 * !< Input port device types<br>
	 * C type : DATA8[4]
	 */
	public byte[] InDcm = new byte[4];
	public byte[] getInDcm() {
		return InDcm;
	}
	public void setInDcm(byte InDcm[]) {
		this.InDcm = InDcm;
	}
	/** C type : DATA8[4] */
	public byte[] InConn = new byte[4];
	public byte[] getInConn() {
		return InConn;
	}
	public void setInConn(byte InConn[]) {
		this.InConn = InConn;
	}
	/**
	 * !< Output port device types<br>
	 * C type : DATA8[4]
	 */
	public byte[] OutDcm = new byte[4];
	public byte[] getOutDcm() {
		return OutDcm;
	}
	public void setOutDcm(byte OutDcm[]) {
		this.OutDcm = OutDcm;
	}
	/** C type : DATA8[4] */
	public byte[] OutConn = new byte[4];
	public byte[] getOutConn() {
		return OutConn;
	}
	public void setOutConn(byte OutConn[]) {
		this.OutConn = OutConn;
	}
	public ANALOG() {
		super();
	}
	public ANALOG(Pointer peer) {
		super(peer);
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("InPin1", "InPin6", "OutPin5", "BatteryTemp", "MotorCurrent", "BatteryCurrent", "Cell123456", "Pin1", "Pin6", "Actual", "LogIn", "LogOut", "NxtCol", "OutPin5Low", "Updated", "InDcm", "InConn", "OutDcm", "OutConn");
	}
	public static class ByReference extends ANALOG implements Structure.ByReference {
		
	};
	public static class ByValue extends ANALOG implements Structure.ByValue {
		
	};
}
