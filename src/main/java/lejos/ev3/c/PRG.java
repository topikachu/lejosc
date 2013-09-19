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
public class PRG extends Structure {
	/** !< Instruction counter used for performance analyses */
	public NativeLong InstrCnt;
	public NativeLong getInstrCnt() {
		return InstrCnt;
	}
	public void setInstrCnt(NativeLong InstrCnt) {
		this.InstrCnt = InstrCnt;
	}
	/** !< Instruction time used for performance analyses */
	public NativeLong InstrTime;
	public NativeLong getInstrTime() {
		return InstrTime;
	}
	public void setInstrTime(NativeLong InstrTime) {
		this.InstrTime = InstrTime;
	}
	/** !< Program start time [mS] */
	public NativeLong StartTime;
	public NativeLong getStartTime() {
		return StartTime;
	}
	public void setStartTime(NativeLong StartTime) {
		this.StartTime = StartTime;
	}
	/** !< Program run time [uS] */
	public NativeLong RunTime;
	public NativeLong getRunTime() {
		return RunTime;
	}
	public void setRunTime(NativeLong RunTime) {
		this.RunTime = RunTime;
	}
	/**
	 * !< Pointer to start of image<br>
	 * C type : IP
	 */
	public Pointer pImage;
	public Pointer getPImage() {
		return pImage;
	}
	public void setPImage(Pointer pImage) {
		this.pImage = pImage;
	}
	/**
	 * !< Pointer to start of data<br>
	 * C type : GP
	 */
	public Pointer pData;
	public Pointer getPData() {
		return pData;
	}
	public void setPData(Pointer pData) {
		this.pData = pData;
	}
	/**
	 * !< Pointer to start of global bytes<br>
	 * C type : GP
	 */
	public Pointer pGlobal;
	public Pointer getPGlobal() {
		return pGlobal;
	}
	public void setPGlobal(Pointer pGlobal) {
		this.pGlobal = pGlobal;
	}
	/**
	 * !< Pointer to start of object headers<br>
	 * C type : OBJHEAD*
	 */
	public lejos.ev3.c.OBJHEAD.ByReference pObjHead;
	public lejos.ev3.c.OBJHEAD.ByReference getPObjHead() {
		return pObjHead;
	}
	public void setPObjHead(lejos.ev3.c.OBJHEAD.ByReference pObjHead) {
		this.pObjHead = pObjHead;
	}
	/**
	 * !< Pointer to object pointer list<br>
	 * C type : OBJ**
	 */
	public lejos.ev3.c.OBJ.ByReference[] pObjList;
	public lejos.ev3.c.OBJ.ByReference[] getPObjList() {
		return pObjList;
	}
	public void setPObjList(lejos.ev3.c.OBJ.ByReference pObjList[]) {
		this.pObjList = pObjList;
	}
	/**
	 * !< Working object Ip<br>
	 * C type : IP
	 */
	public Pointer ObjectIp;
	public Pointer getObjectIp() {
		return ObjectIp;
	}
	public void setObjectIp(Pointer ObjectIp) {
		this.ObjectIp = ObjectIp;
	}
	/**
	 * !< Working object locals<br>
	 * C type : LP
	 */
	public Pointer ObjectLocal;
	public Pointer getObjectLocal() {
		return ObjectLocal;
	}
	public void setObjectLocal(Pointer ObjectLocal) {
		this.ObjectLocal = ObjectLocal;
	}
	/**
	 * !< No of objects in image<br>
	 * C type : OBJID
	 */
	public short Objects;
	public short getObjects() {
		return Objects;
	}
	public void setObjects(short Objects) {
		this.Objects = Objects;
	}
	/**
	 * !< Active object id<br>
	 * C type : OBJID
	 */
	public short ObjectId;
	public short getObjectId() {
		return ObjectId;
	}
	public void setObjectId(short ObjectId) {
		this.ObjectId = ObjectId;
	}
	/**
	 * @see OBJSTAT<br>
	 * !< Program status<br>
	 * C type : OBJSTAT
	 */
	public int Status;
	public int getStatus() {
		return Status;
	}
	public void setStatus(int Status) {
		this.Status = Status;
	}
	/**
	 * @see OBJSTAT<br>
	 * !< Program status change<br>
	 * C type : OBJSTAT
	 */
	public int StatusChange;
	public int getStatusChange() {
		return StatusChange;
	}
	public void setStatusChange(int StatusChange) {
		this.StatusChange = StatusChange;
	}
	/**
	 * @see RESULT<br>
	 * !< Program result (OK, BUSY, FAIL)<br>
	 * C type : RESULT
	 */
	public int Result;
	public int getResult() {
		return Result;
	}
	public void setResult(int Result) {
		this.Result = Result;
	}
	/**
	 * !< Storage for breakpoint logic<br>
	 * C type : BRKP[4]
	 */
	public BRKP[] Brkp = new BRKP[4];
	public BRKP[] getBrkp() {
		return Brkp;
	}
	public void setBrkp(BRKP Brkp[]) {
		this.Brkp = Brkp;
	}
	/**
	 * !< Storage for labels<br>
	 * C type : LABEL[32]
	 */
	public LABEL[] Label = new LABEL[32];
	public LABEL[] getLabel() {
		return Label;
	}
	public void setLabel(LABEL Label[]) {
		this.Label = Label;
	}
	/**
	 * !< Debug flag<br>
	 * C type : UWORD
	 */
	public short Debug;
	public short getDebug() {
		return Debug;
	}
	public void setDebug(short Debug) {
		this.Debug = Debug;
	}
	/** C type : DATA8[52] */
	public byte[] Name = new byte[52];
	public byte[] getName() {
		return Name;
	}
	public void setName(byte Name[]) {
		this.Name = Name;
	}
	public PRG() {
		super();
	}
	public PRG(Pointer address) {
		super(address);
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("InstrCnt", "InstrTime", "StartTime", "RunTime", "pImage", "pData", "pGlobal", "pObjHead", "pObjList", "ObjectIp", "ObjectLocal", "Objects", "ObjectId", "Status", "StatusChange", "Result", "Brkp", "Label", "Debug", "Name");
	}
	public static class ByReference extends PRG implements Structure.ByReference {
		
	};
	public static class ByValue extends PRG implements Structure.ByValue {
		
	};
}