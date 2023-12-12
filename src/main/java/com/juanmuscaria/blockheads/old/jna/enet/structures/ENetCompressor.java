package com.juanmuscaria.blockheads.old.jna.enet.structures;

import com.juanmuscaria.blockheads.old.jna.types.Size_t;
import com.sun.jna.Callback;
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
public class ENetCompressor extends Structure {
  /**
   * C type : void*
   */
  public Pointer context;
  /**
   * C type : compress_callback*
   */
  public compress_callback compress;
  /**
   * C type : decompress_callback*
   */
  public decompress_callback decompress;
  /**
   * C type : destroy_callback*
   */
  public destroy_callback destroy;

  public ENetCompressor() {
    super();
  }

  /**
   * @param context    C type : void*<br>
   * @param compress   C type : compress_callback*<br>
   * @param decompress C type : decompress_callback*<br>
   * @param destroy    C type : destroy_callback*
   */
  public ENetCompressor(Pointer context, compress_callback compress, decompress_callback decompress, destroy_callback destroy) {
    super();
    this.context = context;
    this.compress = compress;
    this.decompress = decompress;
    this.destroy = destroy;
  }

  public ENetCompressor(Pointer peer) {
    super(peer);
  }

  protected List<String> getFieldOrder() {
    return Arrays.asList("context", "compress", "decompress", "destroy");
  }

  /**
   * <i>native declaration : enet/enet.h</i>
   */
  public interface compress_callback extends Callback {
    Size_t apply(Pointer context, ENetBuffer inBuffers, Size_t inBufferCount, Size_t inLimit, Pointer outData, Size_t outLimit);
  }

  /**
   * <i>native declaration : enet/enet.h</i>
   */
  public interface decompress_callback extends Callback {
    Size_t apply(Pointer context, Pointer inData, Size_t inLimit, Pointer outData, Size_t outLimit);
  }

  /**
   * <i>native declaration : enet/enet.h</i>
   */
  public interface destroy_callback extends Callback {
    void apply(Pointer context);
  }

  public static class ByReference extends ENetCompressor implements Structure.ByReference {

  }

  public static class ByValue extends ENetCompressor implements Structure.ByValue {

  }
}
