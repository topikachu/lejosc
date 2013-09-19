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
public class IICSTR extends Structure {
	/** C type : DATA8 */
	public byte Port;
	public byte getPort() {
		return Port;
	}
	public void setPort(byte Port) {
		this.Port = Port;
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
	public byte Type;
	public byte getType() {
		return Type;
	}
	public void setType(byte Type) {
		this.Type = Type;
	}
	/** C type : DATA8 */
	public byte Mode;
	public byte getMode() {
		return Mode;
	}
	public void setMode(byte Mode) {
		this.Mode = Mode;
	}
	/** C type : DATA8[8 + 1] */
	public byte[] Manufacturer = new byte[8 + 1];
	public byte[] getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(byte Manufacturer[]) {
		this.Manufacturer = Manufacturer;
	}
	/** C type : DATA8[8 + 1] */
	public byte[] SensorType = new byte[8 + 1];
	public byte[] getSensorType() {
		return SensorType;
	}
	public void setSensorType(byte SensorType[]) {
		this.SensorType = SensorType;
	}
	/** C type : DATA8 */
	public byte SetupLng;
	public byte getSetupLng() {
		return SetupLng;
	}
	public void setSetupLng(byte SetupLng) {
		this.SetupLng = SetupLng;
	}
	public NativeLong SetupString;
	public NativeLong getSetupString() {
		return SetupString;
	}
	public void setSetupString(NativeLong SetupString) {
		this.SetupString = SetupString;
	}
	/** C type : DATA8 */
	public byte PollLng;
	public byte getPollLng() {
		return PollLng;
	}
	public void setPollLng(byte PollLng) {
		this.PollLng = PollLng;
	}
	public NativeLong PollString;
	public NativeLong getPollString() {
		return PollString;
	}
	public void setPollString(NativeLong PollString) {
		this.PollString = PollString;
	}
	/** C type : DATA8 */
	public byte ReadLng;
	public byte getReadLng() {
		return ReadLng;
	}
	public void setReadLng(byte ReadLng) {
		this.ReadLng = ReadLng;
	}
	public IICSTR() {
		super();
	}
	public IICSTR(Pointer peer) {
		super(peer);
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("Port", "Time", "Type", "Mode", "Manufacturer", "SensorType", "SetupLng", "SetupString", "PollLng", "PollString", "ReadLng");
	}
	public static class ByReference extends IICSTR implements Structure.ByReference {
		
	};
	public static class ByValue extends IICSTR implements Structure.ByValue {
		
	};
}
