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
public class GLOBALS extends Structure {
	/** C type : NONVOL */
	public NONVOL NonVol;
	public NONVOL getNonVol() {
		return NonVol;
	}
	public void setNonVol(NONVOL NonVol) {
		this.NonVol = NonVol;
	}
	/** C type : DATA8[(10 + 52 + 52 + 5)] */
	public byte[] FirstProgram = new byte[10 + 52 + 52 + 5];
	public byte[] getFirstProgram() {
		return FirstProgram;
	}
	public void setFirstProgram(byte FirstProgram[]) {
		this.FirstProgram = FirstProgram;
	}
	/** C type : char[160 + 1] */
	public byte[] PrintBuffer = new byte[160 + 1];
	public byte[] getPrintBuffer() {
		return PrintBuffer;
	}
	public void setPrintBuffer(byte PrintBuffer[]) {
		this.PrintBuffer = PrintBuffer;
	}
	/** C type : DATA8 */
	public byte TerminalEnabled;
	public byte getTerminalEnabled() {
		return TerminalEnabled;
	}
	public void setTerminalEnabled(byte TerminalEnabled) {
		this.TerminalEnabled = TerminalEnabled;
	}
	/** C type : PRGID */
	public short FavouritePrg;
	public short getFavouritePrg() {
		return FavouritePrg;
	}
	public void setFavouritePrg(short FavouritePrg) {
		this.FavouritePrg = FavouritePrg;
	}
	/**
	 * !< Program id running<br>
	 * C type : PRGID
	 */
	public short ProgramId;
	public short getProgramId() {
		return ProgramId;
	}
	public void setProgramId(short ProgramId) {
		this.ProgramId = ProgramId;
	}
	/**
	 * !< Program[0] is the UI byte codes running<br>
	 * C type : PRG[SLOTS]
	 */
	public PRG[] Program = new PRG[(int)lejos.ev3.c.Lms2012Library.SLOT.SLOTS];
	public PRG[] getProgram() {
		return Program;
	}
	public void setProgram(PRG Program[]) {
		this.Program = Program;
	}
	/** !< Instruction counter (performance test) */
	public NativeLong InstrCnt;
	public NativeLong getInstrCnt() {
		return InstrCnt;
	}
	public void setInstrCnt(NativeLong InstrCnt) {
		this.InstrCnt = InstrCnt;
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
	/** C type : IP */
	public Pointer ObjIpSave;
	public Pointer getObjIpSave() {
		return ObjIpSave;
	}
	public void setObjIpSave(Pointer ObjIpSave) {
		this.ObjIpSave = ObjIpSave;
	}
	/** C type : GP */
	public Pointer ObjGlobalSave;
	public Pointer getObjGlobalSave() {
		return ObjGlobalSave;
	}
	public void setObjGlobalSave(Pointer ObjGlobalSave) {
		this.ObjGlobalSave = ObjGlobalSave;
	}
	/** C type : LP */
	public Pointer ObjLocalSave;
	public Pointer getObjLocalSave() {
		return ObjLocalSave;
	}
	public void setObjLocalSave(Pointer ObjLocalSave) {
		this.ObjLocalSave = ObjLocalSave;
	}
	/**
	 * @see DSPSTAT<br>
	 * C type : DSPSTAT
	 */
	public int DispatchStatusSave;
	public int getDispatchStatusSave() {
		return DispatchStatusSave;
	}
	public void setDispatchStatusSave(int DispatchStatusSave) {
		this.DispatchStatusSave = DispatchStatusSave;
	}
	public NativeLong PrioritySave;
	public NativeLong getPrioritySave() {
		return PrioritySave;
	}
	public void setPrioritySave(NativeLong PrioritySave) {
		this.PrioritySave = PrioritySave;
	}
	public NativeLong TimerDataSec;
	public NativeLong getTimerDataSec() {
		return TimerDataSec;
	}
	public void setTimerDataSec(NativeLong TimerDataSec) {
		this.TimerDataSec = TimerDataSec;
	}
	public NativeLong TimerDatanSec;
	public NativeLong getTimerDatanSec() {
		return TimerDatanSec;
	}
	public void setTimerDatanSec(NativeLong TimerDatanSec) {
		this.TimerDatanSec = TimerDatanSec;
	}
	/** C type : UWORD */
	public short Debug;
	public short getDebug() {
		return Debug;
	}
	public void setDebug(short Debug) {
		this.Debug = Debug;
	}
	/** C type : UWORD */
	public short Test;
	public short getTest() {
		return Test;
	}
	public void setTest(short Test) {
		this.Test = Test;
	}
	/** C type : UWORD */
	public short RefCount;
	public short getRefCount() {
		return RefCount;
	}
	public void setRefCount(short RefCount) {
		this.RefCount = RefCount;
	}
	public NativeLong TimeuS;
	public NativeLong getTimeuS() {
		return TimeuS;
	}
	public void setTimeuS(NativeLong TimeuS) {
		this.TimeuS = TimeuS;
	}
	public NativeLong OldTime1;
	public NativeLong getOldTime1() {
		return OldTime1;
	}
	public void setOldTime1(NativeLong OldTime1) {
		this.OldTime1 = OldTime1;
	}
	public NativeLong OldTime2;
	public NativeLong getOldTime2() {
		return OldTime2;
	}
	public void setOldTime2(NativeLong OldTime2) {
		this.OldTime2 = OldTime2;
	}
	public NativeLong NewTime;
	public NativeLong getNewTime() {
		return NewTime;
	}
	public void setNewTime(NativeLong NewTime) {
		this.NewTime = NewTime;
	}
	/**
	 * @see DSPSTAT<br>
	 * !< Dispatch status<br>
	 * C type : DSPSTAT
	 */
	public int DispatchStatus;
	public int getDispatchStatus() {
		return DispatchStatus;
	}
	public void setDispatchStatus(int DispatchStatus) {
		this.DispatchStatus = DispatchStatus;
	}
	/** !< Object priority */
	public NativeLong Priority;
	public NativeLong getPriority() {
		return Priority;
	}
	public void setPriority(NativeLong Priority) {
		this.Priority = Priority;
	}
	public NativeLong Value;
	public NativeLong getValue() {
		return Value;
	}
	public void setValue(NativeLong Value) {
		this.Value = Value;
	}
	/** C type : HANDLER */
	public short Handle;
	public short getHandle() {
		return Handle;
	}
	public void setHandle(short Handle) {
		this.Handle = Handle;
	}
	/** C type : ERR[8] */
	public int[] Errors = new int[8];
	public int[] getErrors() {
		return Errors;
	}
	public void setErrors(int Errors[]) {
		this.Errors = Errors;
	}
	public byte ErrorIn;
	public byte getErrorIn() {
		return ErrorIn;
	}
	public void setErrorIn(byte ErrorIn) {
		this.ErrorIn = ErrorIn;
	}
	public byte ErrorOut;
	public byte getErrorOut() {
		return ErrorOut;
	}
	public void setErrorOut(byte ErrorOut) {
		this.ErrorOut = ErrorOut;
	}
	/** C type : DATA32 */
	public int MemorySize;
	public int getMemorySize() {
		return MemorySize;
	}
	public void setMemorySize(int MemorySize) {
		this.MemorySize = MemorySize;
	}
	/** C type : DATA32 */
	public int MemoryFree;
	public int getMemoryFree() {
		return MemoryFree;
	}
	public void setMemoryFree(int MemoryFree) {
		this.MemoryFree = MemoryFree;
	}
	public NativeLong MemoryTimer;
	public NativeLong getMemoryTimer() {
		return MemoryTimer;
	}
	public void setMemoryTimer(NativeLong MemoryTimer) {
		this.MemoryTimer = MemoryTimer;
	}
	/** C type : DATA32 */
	public int SdcardSize;
	public int getSdcardSize() {
		return SdcardSize;
	}
	public void setSdcardSize(int SdcardSize) {
		this.SdcardSize = SdcardSize;
	}
	/** C type : DATA32 */
	public int SdcardFree;
	public int getSdcardFree() {
		return SdcardFree;
	}
	public void setSdcardFree(int SdcardFree) {
		this.SdcardFree = SdcardFree;
	}
	public NativeLong SdcardTimer;
	public NativeLong getSdcardTimer() {
		return SdcardTimer;
	}
	public void setSdcardTimer(NativeLong SdcardTimer) {
		this.SdcardTimer = SdcardTimer;
	}
	/** C type : DATA8 */
	public byte SdcardOk;
	public byte getSdcardOk() {
		return SdcardOk;
	}
	public void setSdcardOk(byte SdcardOk) {
		this.SdcardOk = SdcardOk;
	}
	/**
	 * !< Copy of last LCD update<br>
	 * C type : LCD
	 */
	public LCD LcdBuffer;
	public LCD getLcdBuffer() {
		return LcdBuffer;
	}
	public void setLcdBuffer(LCD LcdBuffer) {
		this.LcdBuffer = LcdBuffer;
	}
	/**
	 * !< LCD updated<br>
	 * C type : DATA8
	 */
	public byte LcdUpdated;
	public byte getLcdUpdated() {
		return LcdUpdated;
	}
	public void setLcdUpdated(byte LcdUpdated) {
		this.LcdUpdated = LcdUpdated;
	}
	/** C type : ANALOG */
	public ANALOG Analog;
	public ANALOG getAnalog() {
		return Analog;
	}
	public void setAnalog(ANALOG Analog) {
		this.Analog = Analog;
	}
	/** C type : ANALOG* */
	public ANALOG.ByReference pAnalog;
	public ANALOG.ByReference getPAnalog() {
		return pAnalog;
	}
	public void setPAnalog(ANALOG.ByReference pAnalog) {
		this.pAnalog = pAnalog;
	}
	public int AdcFile;
	public int getAdcFile() {
		return AdcFile;
	}
	public void setAdcFile(int AdcFile) {
		this.AdcFile = AdcFile;
	}
	public GLOBALS() {
		super();
	}
	public GLOBALS(Pointer peer) {
		super(peer);
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("NonVol", "FirstProgram", "PrintBuffer", "TerminalEnabled", "FavouritePrg", "ProgramId", "Program", "InstrCnt", "pImage", "pGlobal", "pObjHead", "pObjList", "ObjectIp", "ObjectLocal", "Objects", "ObjectId", "ObjIpSave", "ObjGlobalSave", "ObjLocalSave", "DispatchStatusSave", "PrioritySave", "TimerDataSec", "TimerDatanSec", "Debug", "Test", "RefCount", "TimeuS", "OldTime1", "OldTime2", "NewTime", "DispatchStatus", "Priority", "Value", "Handle", "Errors", "ErrorIn", "ErrorOut", "MemorySize", "MemoryFree", "MemoryTimer", "SdcardSize", "SdcardFree", "SdcardTimer", "SdcardOk", "LcdBuffer", "LcdUpdated", "Analog", "pAnalog", "AdcFile");
	}
	public static class ByReference extends GLOBALS implements Structure.ByReference {
		
	};
	public static class ByValue extends GLOBALS implements Structure.ByValue {
		
	};
}
