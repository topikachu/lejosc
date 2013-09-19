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
public class BRKP extends Structure {
	/**
	 * !< Offset to breakpoint address from image start<br>
	 * C type : IMINDEX
	 */
	public NativeLong Addr;
	public NativeLong getAddr() {
		return Addr;
	}
	public void setAddr(NativeLong Addr) {
		this.Addr = Addr;
	}
	/**
	 * @see OP<br>
	 * !< Saved substituted opcode<br>
	 * C type : OP
	 */
	public int OpCode;
	public int getOpCode() {
		return OpCode;
	}
	public void setOpCode(int OpCode) {
		this.OpCode = OpCode;
	}
	public BRKP() {
		super();
	}
	public BRKP(Pointer address) {
		super(address);
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("Addr", "OpCode");
	}
	/**
	 * @param Addr !< Offset to breakpoint address from image start<br>
	 * C type : IMINDEX<br>
	 * @param OpCode @see OP<br>
	 * !< Saved substituted opcode<br>
	 * C type : OP
	 */
	public BRKP(NativeLong Addr, int OpCode) {
		super();
		this.Addr = Addr;
		this.OpCode = OpCode;
	}
	public static class ByReference extends BRKP implements Structure.ByReference {
		
	};
	public static class ByValue extends BRKP implements Structure.ByValue {
		
	};
}
