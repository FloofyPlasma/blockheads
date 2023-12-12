package com.juanmuscaria.blockheads.old.jna.enet.structures;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * <i>native declaration : ./enet/protocol.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ENetProtocolThrottleConfigure extends Structure {
  /**
   * C type : ENetProtocolCommandHeader
   */
  public ENetProtocolCommandHeader header;
  /**
   * C type : enet_uint32
   */
  public int packetThrottleInterval;
  /**
   * C type : enet_uint32
   */
  public int packetThrottleAcceleration;
  /**
   * C type : enet_uint32
   */
  public int packetThrottleDeceleration;

  public ENetProtocolThrottleConfigure() {
    super();
  }

  /**
   * @param header                     C type : ENetProtocolCommandHeader<br>
   * @param packetThrottleInterval     C type : enet_uint32<br>
   * @param packetThrottleAcceleration C type : enet_uint32<br>
   * @param packetThrottleDeceleration C type : enet_uint32
   */
  public ENetProtocolThrottleConfigure(ENetProtocolCommandHeader header, int packetThrottleInterval, int packetThrottleAcceleration, int packetThrottleDeceleration) {
    super();
    this.header = header;
    this.packetThrottleInterval = packetThrottleInterval;
    this.packetThrottleAcceleration = packetThrottleAcceleration;
    this.packetThrottleDeceleration = packetThrottleDeceleration;
  }

  public ENetProtocolThrottleConfigure(Pointer peer) {
    super(peer);
  }

  protected List<String> getFieldOrder() {
    return Arrays.asList("header", "packetThrottleInterval", "packetThrottleAcceleration", "packetThrottleDeceleration");
  }

  public static class ByReference extends ENetProtocolThrottleConfigure implements Structure.ByReference {

  }

  public static class ByValue extends ENetProtocolThrottleConfigure implements Structure.ByValue {

  }
}
