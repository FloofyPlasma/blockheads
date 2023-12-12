package com.juanmuscaria.blockheads.old.jna.enet.structures;

import com.juanmuscaria.blockheads.old.jna.enet.Enet;
import com.juanmuscaria.blockheads.old.jna.types.Size_t;
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
public class ENetHost extends Structure {
  /**
   * C type : ENetSocket
   */
  public Enet.ENetSocket socket;
  /**
   * < Internet address of the host<br>
   * C type : ENetAddress
   */
  public ENetAddress address;
  /**
   * < downstream bandwidth of the host<br>
   * C type : enet_uint32
   */
  public int incomingBandwidth;
  /**
   * < upstream bandwidth of the host<br>
   * C type : enet_uint32
   */
  public int outgoingBandwidth;
  /**
   * C type : enet_uint32
   */
  public int bandwidthThrottleEpoch;
  /**
   * C type : enet_uint32
   */
  public int mtu;
  /**
   * C type : enet_uint32
   */
  public int randomSeed;
  public int recalculateBandwidthLimits;
  /**
   * < array of peers allocated for this host<br>
   * C type : ENetPeer*
   */
  public ENetPeer.ByReference peers;
  /**
   * < number of peers allocated for this host
   */
  public Size_t peerCount;
  /**
   * < maximum number of channels allowed for connected peers
   */
  public Size_t channelLimit;
  /**
   * C type : enet_uint32
   */
  public int serviceTime;
  /**
   * C type : ENetList
   */
  public ENetList dispatchQueue;
  public int continueSending;
  public Size_t packetSize;
  /**
   * C type : enet_uint16
   */
  public short headerFlags;
  /**
   * C type : ENetProtocol[ENET_PROTOCOL_MAXIMUM_PACKET_COMMANDS]
   */
  public ENetProtocol[] commands = new ENetProtocol[Enet.ENET_PROTOCOL_MAXIMUM_PACKET_COMMANDS];
  public Size_t commandCount;
  /**
   * C type : ENetBuffer[(1 + 2 * ENET_PROTOCOL_MAXIMUM_PACKET_COMMANDS)]
   */
  public ENetBuffer[] buffers = new ENetBuffer[1 + 2 * Enet.ENET_PROTOCOL_MAXIMUM_PACKET_COMMANDS];
  public Size_t bufferCount;
  /**
   * < callback the user can set to enable packet checksums for this host<br>
   * C type : ENetChecksumCallback
   */
  public Enet.ENetChecksumCallback checksum;
  /**
   * C type : ENetCompressor
   */
  public ENetCompressor compressor;
  /**
   * C type : enet_uint8[2][ENET_PROTOCOL_MAXIMUM_MTU]
   */
  public byte[] packetData = new byte[((2) * Enet.ENET_PROTOCOL_MAXIMUM_MTU)];
  /**
   * C type : ENetAddress
   */
  public ENetAddress receivedAddress;
  /**
   * C type : enet_uint8*
   */
  public Pointer receivedData;
  public Size_t receivedDataLength;
  /**
   * < total data sent, user should reset to 0 as needed to prevent overflow<br>
   * C type : enet_uint32
   */
  public int totalSentData;
  /**
   * < total UDP packets sent, user should reset to 0 as needed to prevent overflow<br>
   * C type : enet_uint32
   */
  public int totalSentPackets;
  /**
   * < total data received, user should reset to 0 as needed to prevent overflow<br>
   * C type : enet_uint32
   */
  public int totalReceivedData;
  /**
   * < total UDP packets received, user should reset to 0 as needed to prevent overflow<br>
   * C type : enet_uint32
   */
  public int totalReceivedPackets;
  /**
   * < callback the user can set to intercept received raw UDP packets<br>
   * C type : ENetInterceptCallback
   */
  public Enet.ENetInterceptCallback intercept;
  public Size_t connectedPeers;
  public Size_t bandwidthLimitedPeers;
  /**
   * < optional number of allowed peers from duplicate IPs, defaults to ENET_PROTOCOL_MAXIMUM_PEER_ID
   */
  public Size_t duplicatePeers;
  /**
   * < the maximum allowable packet size that may be sent or received on a peer
   */
  public Size_t maximumPacketSize;
  /**
   * < the maximum aggregate amount of buffer space a peer may use waiting for packets to be delivered
   */
  public Size_t maximumWaitingData;

  public ENetHost() {
    super();
  }

  public ENetHost(Pointer peer) {
    super(peer);
  }

  protected List<String> getFieldOrder() {
    return Arrays.asList("socket", "address", "incomingBandwidth", "outgoingBandwidth", "bandwidthThrottleEpoch", "mtu", "randomSeed", "recalculateBandwidthLimits", "peers", "peerCount", "channelLimit", "serviceTime", "dispatchQueue", "continueSending", "packetSize", "headerFlags", "commands", "commandCount", "buffers", "bufferCount", "checksum", "compressor", "packetData", "receivedAddress", "receivedData", "receivedDataLength", "totalSentData", "totalSentPackets", "totalReceivedData", "totalReceivedPackets", "intercept", "connectedPeers", "bandwidthLimitedPeers", "duplicatePeers", "maximumPacketSize", "maximumWaitingData");
  }

  public static class ByReference extends ENetHost implements Structure.ByReference {

  }

  public static class ByValue extends ENetHost implements Structure.ByValue {

  }
}
