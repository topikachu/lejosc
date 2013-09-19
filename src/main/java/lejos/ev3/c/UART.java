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
public class UART extends Structure {
	/**
	 * !< TypeData<br>
	 * C type : TYPES[4][8]
	 */
	public TYPES[] TypeData = new TYPES[((4) * (8))];
	public TYPES[] getTypeData() {
		return TypeData;
	}
	public void setTypeData(TYPES TypeData[]) {
		this.TypeData = TypeData;
	}
	/** C type : UWORD[4][300] */
	public short[] Repeat = new short[((4) * (300))];
	public short[] getRepeat() {
		return Repeat;
	}
	public void setRepeat(short Repeat[]) {
		this.Repeat = Repeat;
	}
	/**
	 * !< Raw value from UART device<br>
	 * C type : DATA8[4][300][32]
	 */
	public byte[] Raw = new byte[((4) * ((300) * (32)))];
	public byte[] getRaw() {
		return Raw;
	}
	public void setRaw(byte Raw[]) {
		this.Raw = Raw;
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
	/**
	 * !< Status<br>
	 * C type : DATA8[4]
	 */
	public byte[] Status = new byte[4];
	public byte[] getStatus() {
		return Status;
	}
	public void setStatus(byte Status[]) {
		this.Status = Status;
	}
	/**
	 * !< Bytes to UART device<br>
	 * C type : DATA8[4][32]
	 */
	public byte[] Output = new byte[((4) * (32))];
	public byte[] getOutput() {
		return Output;
	}
	public void setOutput(byte Output[]) {
		this.Output = Output;
	}
	/** C type : DATA8[4] */
	public byte[] OutputLength = new byte[4];
	public byte[] getOutputLength() {
		return OutputLength;
	}
	public void setOutputLength(byte OutputLength[]) {
		this.OutputLength = OutputLength;
	}
	public UART() {
		super();
	}
	public UART(Pointer address) {
		super(address);
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("TypeData", "Repeat", "Raw", "Actual", "LogIn", "Status", "Output", "OutputLength");
	}
	/**
	 * @param TypeData !< TypeData<br>
	 * C type : TYPES[4][8]<br>
	 * @param Repeat C type : UWORD[4][300]<br>
	 * @param Raw !< Raw value from UART device<br>
	 * C type : DATA8[4][300][32]<br>
	 * @param Actual C type : UWORD[4]<br>
	 * @param LogIn C type : UWORD[4]<br>
	 * @param Status !< Status<br>
	 * C type : DATA8[4]<br>
	 * @param Output !< Bytes to UART device<br>
	 * C type : DATA8[4][32]<br>
	 * @param OutputLength C type : DATA8[4]
	 */
	public UART(TYPES TypeData[], short Repeat[], byte Raw[], short Actual[], short LogIn[], byte Status[], byte Output[], byte OutputLength[]) {
		super();
		if ((TypeData.length != this.TypeData.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.TypeData = TypeData;
		if ((Repeat.length != this.Repeat.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.Repeat = Repeat;
		if ((Raw.length != this.Raw.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.Raw = Raw;
		if ((Actual.length != this.Actual.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.Actual = Actual;
		if ((LogIn.length != this.LogIn.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.LogIn = LogIn;
		if ((Status.length != this.Status.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.Status = Status;
		if ((Output.length != this.Output.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.Output = Output;
		if ((OutputLength.length != this.OutputLength.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.OutputLength = OutputLength;
	}
	public static class ByReference extends UART implements Structure.ByReference {
		
	};
	public static class ByValue extends UART implements Structure.ByValue {
		
	};
}