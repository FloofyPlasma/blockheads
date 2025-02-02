// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.foreign.*;

/**
 * {@snippet :
 * union _ENetProtocol {
 *     ENetProtocolCommandHeader header;
 *     ENetProtocolAcknowledge acknowledge;
 *     ENetProtocolConnect connect;
 *     ENetProtocolVerifyConnect verifyConnect;
 *     ENetProtocolDisconnect disconnect;
 *     ENetProtocolPing ping;
 *     ENetProtocolSendReliable sendReliable;
 *     ENetProtocolSendUnreliable sendUnreliable;
 *     ENetProtocolSendUnsequenced sendUnsequenced;
 *     ENetProtocolSendFragment sendFragment;
 *     ENetProtocolBandwidthLimit bandwidthLimit;
 *     ENetProtocolThrottleConfigure throttleConfigure;
 * };
 * }
 */
public class _ENetProtocol {

    public static MemoryLayout $LAYOUT() {
        return constants$90.const$4;
    }
    public static MemorySegment header$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static MemorySegment acknowledge$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment connect$slice(MemorySegment seg) {
        return seg.asSlice(0, 48);
    }
    public static MemorySegment verifyConnect$slice(MemorySegment seg) {
        return seg.asSlice(0, 44);
    }
    public static MemorySegment disconnect$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment ping$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static MemorySegment sendReliable$slice(MemorySegment seg) {
        return seg.asSlice(0, 6);
    }
    public static MemorySegment sendUnreliable$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment sendUnsequenced$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment sendFragment$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    public static MemorySegment bandwidthLimit$slice(MemorySegment seg) {
        return seg.asSlice(0, 12);
    }
    public static MemorySegment throttleConfigure$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


