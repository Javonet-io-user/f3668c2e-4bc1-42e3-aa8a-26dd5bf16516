package ReaderB;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import ReaderB.*;

public class StaticClassReaderB {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WriteEPC_G2(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte[] Password,
      java.lang.Byte[] WriteEPC,
      java.lang.Byte WriteEPClen,
      AtomicReference<java.lang.Integer> errorcode,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "WriteEPC_G2",
                  new NRef(ConAddr),
                  new Object[] {Password},
                  new Object[] {WriteEPC},
                  WriteEPClen,
                  new NRef(errorcode),
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer SetReadProtect_G2(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte[] EPC,
      java.lang.Byte[] Password,
      java.lang.Byte maskadr,
      java.lang.Byte maskLen,
      java.lang.Byte maskFlag,
      java.lang.Byte EPClength,
      AtomicReference<java.lang.Integer> errorcode,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "SetReadProtect_G2",
                  new NRef(ConAddr),
                  new Object[] {EPC},
                  new Object[] {Password},
                  maskadr,
                  maskLen,
                  maskFlag,
                  EPClength,
                  new NRef(errorcode),
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer SetMultiReadProtect_G2(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte[] Password,
      AtomicReference<java.lang.Integer> errorcode,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "SetMultiReadProtect_G2",
                  new NRef(ConAddr),
                  new Object[] {Password},
                  new NRef(errorcode),
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer RemoveReadProtect_G2(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte[] Password,
      AtomicReference<java.lang.Integer> errorcode,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "RemoveReadProtect_G2",
                  new NRef(ConAddr),
                  new Object[] {Password},
                  new NRef(errorcode),
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer CheckReadProtected_G2(
      AtomicReference<java.lang.Byte> ConAddr,
      AtomicReference<java.lang.Byte> readpro,
      AtomicReference<java.lang.Integer> errorcode,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "CheckReadProtected_G2",
                  new NRef(ConAddr),
                  new NRef(readpro),
                  new NRef(errorcode),
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer SetEASAlarm_G2(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte[] EPC,
      java.lang.Byte[] Password,
      java.lang.Byte maskadr,
      java.lang.Byte maskLen,
      java.lang.Byte maskFlag,
      java.lang.Byte EAS,
      java.lang.Byte EPClength,
      AtomicReference<java.lang.Integer> errorcode,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "SetEASAlarm_G2",
                  new NRef(ConAddr),
                  new Object[] {EPC},
                  new Object[] {Password},
                  maskadr,
                  maskLen,
                  maskFlag,
                  EAS,
                  EPClength,
                  new NRef(errorcode),
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer CheckEASAlarm_G2(
      AtomicReference<java.lang.Byte> ConAddr,
      AtomicReference<java.lang.Integer> errorcode,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke("CheckEASAlarm_G2", new NRef(ConAddr), new NRef(errorcode), PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer LockUserBlock_G2(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte[] EPC,
      java.lang.Byte[] Password,
      java.lang.Byte maskadr,
      java.lang.Byte maskLen,
      java.lang.Byte maskFlag,
      java.lang.Byte BlockNum,
      java.lang.Byte EPClength,
      AtomicReference<java.lang.Integer> errorcode,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "LockUserBlock_G2",
                  new NRef(ConAddr),
                  new Object[] {EPC},
                  new Object[] {Password},
                  maskadr,
                  maskLen,
                  maskFlag,
                  BlockNum,
                  EPClength,
                  new NRef(errorcode),
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer Inventory_6B(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte[] ID_6B,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke("Inventory_6B", new NRef(ConAddr), new Object[] {ID_6B}, PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer inventory2_6B(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte Condition,
      java.lang.Byte StartAddress,
      java.lang.Byte mask,
      java.lang.Byte[] ConditionContent,
      java.lang.Byte[] ID_6B,
      AtomicReference<java.lang.Integer> Cardnum,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "inventory2_6B",
                  new NRef(ConAddr),
                  Condition,
                  StartAddress,
                  mask,
                  new Object[] {ConditionContent},
                  new Object[] {ID_6B},
                  new NRef(Cardnum),
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ReadCard_6B(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte[] ID_6B,
      java.lang.Byte StartAddress,
      java.lang.Byte Num,
      java.lang.Byte[] Data,
      AtomicReference<java.lang.Integer> errorcode,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "ReadCard_6B",
                  new NRef(ConAddr),
                  new Object[] {ID_6B},
                  StartAddress,
                  Num,
                  new Object[] {Data},
                  new NRef(errorcode),
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WriteCard_6B(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte[] ID_6B,
      java.lang.Byte StartAddress,
      java.lang.Byte[] Writedata,
      java.lang.Byte Writedatalen,
      AtomicReference<java.lang.Integer> writtenbyte,
      AtomicReference<java.lang.Integer> errorcode,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "WriteCard_6B",
                  new NRef(ConAddr),
                  new Object[] {ID_6B},
                  StartAddress,
                  new Object[] {Writedata},
                  Writedatalen,
                  new NRef(writtenbyte),
                  new NRef(errorcode),
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer LockByte_6B(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte[] ID_6B,
      java.lang.Byte Address,
      AtomicReference<java.lang.Integer> errorcode,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "LockByte_6B",
                  new NRef(ConAddr),
                  new Object[] {ID_6B},
                  Address,
                  new NRef(errorcode),
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer CheckLock_6B(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte[] ID_6B,
      java.lang.Byte Address,
      AtomicReference<java.lang.Byte> ReLockState,
      AtomicReference<java.lang.Integer> errorcode,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "CheckLock_6B",
                  new NRef(ConAddr),
                  new Object[] {ID_6B},
                  Address,
                  new NRef(ReLockState),
                  new NRef(errorcode),
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer SetWGParameter(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte Wg_mode,
      java.lang.Byte Wg_Data_Inteval,
      java.lang.Byte Wg_Pulse_Width,
      java.lang.Byte Wg_Pulse_Inteval,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "SetWGParameter",
                  new NRef(ConAddr),
                  Wg_mode,
                  Wg_Data_Inteval,
                  Wg_Pulse_Width,
                  Wg_Pulse_Inteval,
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer SetWorkMode(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte[] Parameter,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke("SetWorkMode", new NRef(ConAddr), new Object[] {Parameter}, PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer GetWorkModeParameter(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte[] Parameter,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "GetWorkModeParameter", new NRef(ConAddr), new Object[] {Parameter}, PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ReadActiveModeData(
      java.lang.Byte[] ModeData,
      AtomicReference<java.lang.Integer> Datalength,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "ReadActiveModeData", new Object[] {ModeData}, new NRef(Datalength), PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer SetAccuracy(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte Accuracy,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke("SetAccuracy", new NRef(ConAddr), Accuracy, PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer SetOffsetTime(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte OffsetTime,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke("SetOffsetTime", new NRef(ConAddr), OffsetTime, PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer SetFhssMode(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte FhssMode,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke("SetFhssMode", new NRef(ConAddr), FhssMode, PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer GetFhssMode(
      AtomicReference<java.lang.Byte> ConAddr,
      AtomicReference<java.lang.Byte> FhssMode,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke("GetFhssMode", new NRef(ConAddr), new NRef(FhssMode), PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer SetTriggerTime(
      AtomicReference<java.lang.Byte> ConAddr,
      AtomicReference<java.lang.Byte> TriggerTime,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke("SetTriggerTime", new NRef(ConAddr), new NRef(TriggerTime), PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer BuzzerAndLEDControl(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte AvtiveTime,
      java.lang.Byte SilentTime,
      java.lang.Byte Times,
      java.lang.Integer FrmHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "BuzzerAndLEDControl",
                  new NRef(ConAddr),
                  AvtiveTime,
                  SilentTime,
                  Times,
                  FrmHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer SetRelay(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte RelayStatus,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke("SetRelay", new NRef(ConAddr), RelayStatus, PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer OpenNetPort(
      java.lang.Integer Port,
      java.lang.String IPaddr,
      AtomicReference<java.lang.Byte> ComAddr,
      AtomicReference<java.lang.Integer> PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke("OpenNetPort", Port, IPaddr, new NRef(ComAddr), new NRef(PortHandle));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer CloseNetPort(java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB").invoke("CloseNetPort", PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer OpenComPort(
      java.lang.Integer Port,
      AtomicReference<java.lang.Byte> ComAddr,
      java.lang.Byte Baud,
      AtomicReference<java.lang.Integer> PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke("OpenComPort", Port, new NRef(ComAddr), Baud, new NRef(PortHandle));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer CloseComPort() {
    try {
      java.lang.Integer res = Javonet.getType("ReaderB.StaticClassReaderB").invoke("CloseComPort");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer AutoOpenComPort(
      AtomicReference<java.lang.Integer> Port,
      AtomicReference<java.lang.Byte> ComAddr,
      java.lang.Byte Baud,
      AtomicReference<java.lang.Integer> PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "AutoOpenComPort", new NRef(Port), new NRef(ComAddr), Baud, new NRef(PortHandle));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer CloseSpecComPort(java.lang.Integer Port) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB").invoke("CloseSpecComPort", Port);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer GetReaderInformation(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte[] VersionInfo,
      AtomicReference<java.lang.Byte> ReaderType,
      java.lang.Byte[] TrType,
      AtomicReference<java.lang.Byte> dmaxfre,
      AtomicReference<java.lang.Byte> dminfre,
      AtomicReference<java.lang.Byte> powerdBm,
      AtomicReference<java.lang.Byte> ScanTime,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "GetReaderInformation",
                  new NRef(ConAddr),
                  new Object[] {VersionInfo},
                  new NRef(ReaderType),
                  new Object[] {TrType},
                  new NRef(dmaxfre),
                  new NRef(dminfre),
                  new NRef(powerdBm),
                  new NRef(ScanTime),
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WriteComAdr(
      AtomicReference<java.lang.Byte> ConAddr,
      AtomicReference<java.lang.Byte> ComAdrData,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke("WriteComAdr", new NRef(ConAddr), new NRef(ComAdrData), PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer SetPowerDbm(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte powerDbm,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke("SetPowerDbm", new NRef(ConAddr), powerDbm, PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer Writedfre(
      AtomicReference<java.lang.Byte> ConAddr,
      AtomicReference<java.lang.Byte> dmaxfre,
      AtomicReference<java.lang.Byte> dminfre,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "Writedfre", new NRef(ConAddr), new NRef(dmaxfre), new NRef(dminfre), PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer Writebaud(
      AtomicReference<java.lang.Byte> ConAddr,
      AtomicReference<java.lang.Byte> baud,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke("Writebaud", new NRef(ConAddr), new NRef(baud), PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WriteScanTime(
      AtomicReference<java.lang.Byte> ConAddr,
      AtomicReference<java.lang.Byte> ScanTime,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke("WriteScanTime", new NRef(ConAddr), new NRef(ScanTime), PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer InSelfTestMode(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Boolean IsSelfTestMode,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke("InSelfTestMode", new NRef(ConAddr), IsSelfTestMode, PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer RfOutput(
      AtomicReference<java.lang.Byte> ConAddr, java.lang.Byte onoff, java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke("RfOutput", new NRef(ConAddr), onoff, PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer SetPWM(
      AtomicReference<java.lang.Byte> ConAddr, java.lang.Byte PWM, java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke("SetPWM", new NRef(ConAddr), PWM, PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ReadPWM(
      AtomicReference<java.lang.Byte> ConAddr,
      AtomicReference<java.lang.Byte> PWM,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke("ReadPWM", new NRef(ConAddr), new NRef(PWM), PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer SetPowerParameter(
      AtomicReference<java.lang.Byte> ConAddr,
      AtomicReference<java.lang.Byte> power,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke("SetPowerParameter", new NRef(ConAddr), new NRef(power), PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer Getpower(
      AtomicReference<java.lang.Byte> ConAddr,
      AtomicReference<java.lang.Byte> power,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke("Getpower", new NRef(ConAddr), new NRef(power), PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer CheckPowerParameter(
      AtomicReference<java.lang.Byte> ConAddr,
      AtomicReference<java.lang.Integer> code,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke("CheckPowerParameter", new NRef(ConAddr), new NRef(code), PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer GetStartInformation(
      AtomicReference<java.lang.Byte> ConAddr,
      AtomicReference<java.lang.Byte> ADF7020E,
      AtomicReference<java.lang.Byte> FreE,
      AtomicReference<java.lang.Byte> addrE,
      AtomicReference<java.lang.Byte> scnE,
      AtomicReference<java.lang.Byte> xpwrE,
      AtomicReference<java.lang.Byte> pwmE,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "GetStartInformation",
                  new NRef(ConAddr),
                  new NRef(ADF7020E),
                  new NRef(FreE),
                  new NRef(addrE),
                  new NRef(scnE),
                  new NRef(xpwrE),
                  new NRef(pwmE),
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer SolidifyPWMandPowerlist(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte[] dBm_list,
      AtomicReference<java.lang.Integer> code,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "SolidifyPWMandPowerlist",
                  new NRef(ConAddr),
                  new Object[] {dBm_list},
                  new NRef(code),
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer Inventory_G2(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte AdrTID,
      java.lang.Byte LenTID,
      java.lang.Byte TIDFlag,
      java.lang.Byte[] EPClenandEPC,
      AtomicReference<java.lang.Integer> Totallen,
      AtomicReference<java.lang.Integer> CardNum,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "Inventory_G2",
                  new NRef(ConAddr),
                  AdrTID,
                  LenTID,
                  TIDFlag,
                  new Object[] {EPClenandEPC},
                  new NRef(Totallen),
                  new NRef(CardNum),
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ReadCard_G2(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte[] EPC,
      java.lang.Byte Mem,
      java.lang.Byte WordPtr,
      java.lang.Byte Num,
      java.lang.Byte[] Password,
      java.lang.Byte maskadr,
      java.lang.Byte maskLen,
      java.lang.Byte maskFlag,
      java.lang.Byte[] Data,
      java.lang.Byte EPClength,
      AtomicReference<java.lang.Integer> errorcode,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "ReadCard_G2",
                  new NRef(ConAddr),
                  new Object[] {EPC},
                  Mem,
                  WordPtr,
                  Num,
                  new Object[] {Password},
                  maskadr,
                  maskLen,
                  maskFlag,
                  new Object[] {Data},
                  EPClength,
                  new NRef(errorcode),
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WriteCard_G2(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte[] EPC,
      java.lang.Byte Mem,
      java.lang.Byte WordPtr,
      java.lang.Byte Writedatalen,
      java.lang.Byte[] Writedata,
      java.lang.Byte[] Password,
      java.lang.Byte maskadr,
      java.lang.Byte maskLen,
      java.lang.Byte maskFlag,
      java.lang.Integer WrittenDataNum,
      java.lang.Byte EPClength,
      AtomicReference<java.lang.Integer> errorcode,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "WriteCard_G2",
                  new NRef(ConAddr),
                  new Object[] {EPC},
                  Mem,
                  WordPtr,
                  Writedatalen,
                  new Object[] {Writedata},
                  new Object[] {Password},
                  maskadr,
                  maskLen,
                  maskFlag,
                  WrittenDataNum,
                  EPClength,
                  new NRef(errorcode),
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WriteBlock_G2(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte[] EPC,
      java.lang.Byte Mem,
      java.lang.Byte WordPtr,
      java.lang.Byte Writedatalen,
      java.lang.Byte[] Writedata,
      java.lang.Byte[] Password,
      java.lang.Byte maskadr,
      java.lang.Byte maskLen,
      java.lang.Byte maskFlag,
      java.lang.Integer WrittenDataNum,
      java.lang.Byte EPClength,
      AtomicReference<java.lang.Integer> errorcode,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "WriteBlock_G2",
                  new NRef(ConAddr),
                  new Object[] {EPC},
                  Mem,
                  WordPtr,
                  Writedatalen,
                  new Object[] {Writedata},
                  new Object[] {Password},
                  maskadr,
                  maskLen,
                  maskFlag,
                  WrittenDataNum,
                  EPClength,
                  new NRef(errorcode),
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer EraseCard_G2(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte[] EPC,
      java.lang.Byte Mem,
      java.lang.Byte WordPtr,
      java.lang.Byte Num,
      java.lang.Byte[] Password,
      java.lang.Byte maskadr,
      java.lang.Byte maskLen,
      java.lang.Byte maskFlag,
      java.lang.Byte EPClength,
      AtomicReference<java.lang.Integer> errorcode,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "EraseCard_G2",
                  new NRef(ConAddr),
                  new Object[] {EPC},
                  Mem,
                  WordPtr,
                  Num,
                  new Object[] {Password},
                  maskadr,
                  maskLen,
                  maskFlag,
                  EPClength,
                  new NRef(errorcode),
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer SetCardProtect_G2(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte[] EPC,
      java.lang.Byte select,
      java.lang.Byte setprotect,
      java.lang.Byte[] Password,
      java.lang.Byte maskadr,
      java.lang.Byte maskLen,
      java.lang.Byte maskFlag,
      java.lang.Byte EPClength,
      AtomicReference<java.lang.Integer> errorcode,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "SetCardProtect_G2",
                  new NRef(ConAddr),
                  new Object[] {EPC},
                  select,
                  setprotect,
                  new Object[] {Password},
                  maskadr,
                  maskLen,
                  maskFlag,
                  EPClength,
                  new NRef(errorcode),
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer DestroyCard_G2(
      AtomicReference<java.lang.Byte> ConAddr,
      java.lang.Byte[] EPC,
      java.lang.Byte[] Password,
      java.lang.Byte maskadr,
      java.lang.Byte maskLen,
      java.lang.Byte maskFlag,
      java.lang.Byte EPClength,
      AtomicReference<java.lang.Integer> errorcode,
      java.lang.Integer PortHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("ReaderB.StaticClassReaderB")
              .invoke(
                  "DestroyCard_G2",
                  new NRef(ConAddr),
                  new Object[] {EPC},
                  new Object[] {Password},
                  maskadr,
                  maskLen,
                  maskFlag,
                  EPClength,
                  new NRef(errorcode),
                  PortHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
