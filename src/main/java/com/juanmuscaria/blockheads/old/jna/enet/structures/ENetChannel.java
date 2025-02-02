package com.juanmuscaria.blockheads.old.jna.enet.structures;

import com.juanmuscaria.blockheads.old.jna.enet.Enet;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * <i>native declaration : enet/enet.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ENetChannel extends Structure {
  /**
   * C type : enet_uint16
   */
  public short outgoingReliableSequenceNumber;
  /**
   * C type : enet_uint16
   */
  public short outgoingUnreliableSequenceNumber;
  /**
   * C type : enet_uint16
   */
  public short usedReliableWindows;
  /**
   * C type : enet_uint16[ENET_PEER_RELIABLE_WINDOWS]
   */
  public short[] reliableWindows = new short[Enet.ENET_PEER_RELIABLE_WINDOWS];
  /**
   * C type : enet_uint16
   */
  public short incomingReliableSequenceNumber;
  /**
   * C type : enet_uint16
   */
  public short incomingUnreliableSequenceNumber;
  /**
   * C type : ENetList
   */
  public ENetList incomingReliableCommands;
  /**
   * C type : ENetList
   */
  public ENetList incomingUnreliableCommands;

  public ENetChannel() {
    super();
  }

  /**
   * @param outgoingReliableSequenceNumber   C type : enet_uint16<br>
   * @param outgoingUnreliableSequenceNumber C type : enet_uint16<br>
   * @param usedReliableWindows              C type : enet_uint16<br>
   * @param reliableWindows                  C type : enet_uint16[ENET_PEER_RELIABLE_WINDOWS]<br>
   * @param incomingReliableSequenceNumber   C type : enet_uint16<br>
   * @param incomingUnreliableSequenceNumber C type : enet_uint16<br>
   * @param incomingReliableCommands         C type : ENetList<br>
   * @param incomingUnreliableCommands       C type : ENetList
   */
  public ENetChannel(short outgoingReliableSequenceNumber, short outgoingUnreliableSequenceNumber, short usedReliableWindows, short[] reliableWindows, short incomingReliableSequenceNumber, short incomingUnreliableSequenceNumber, ENetList incomingReliableCommands, ENetList incomingUnreliableCommands) {
    super();
    this.outgoingReliableSequenceNumber = outgoingReliableSequenceNumber;
    this.outgoingUnreliableSequenceNumber = outgoingUnreliableSequenceNumber;
    this.usedReliableWindows = usedReliableWindows;
    if ((reliableWindows.length != this.reliableWindows.length))
      throw new IllegalArgumentException("Wrong array size !");
    this.reliableWindows = reliableWindows;
    this.incomingReliableSequenceNumber = incomingReliableSequenceNumber;
    this.incomingUnreliableSequenceNumber = incomingUnreliableSequenceNumber;
    this.incomingReliableCommands = incomingReliableCommands;
    this.incomingUnreliableCommands = incomingUnreliableCommands;
  }

  public ENetChannel(Pointer peer) {
    super(peer);
  }

  protected List<String> getFieldOrder() {
    return Arrays.asList("outgoingReliableSequenceNumber", "outgoingUnreliableSequenceNumber", "usedReliableWindows", "reliableWindows", "incomingReliableSequenceNumber", "incomingUnreliableSequenceNumber", "incomingReliableCommands", "incomingUnreliableCommands");
  }

  public static class ByReference extends ENetChannel implements Structure.ByReference {

  }

  public static class ByValue extends ENetChannel implements Structure.ByValue {

  }
}
