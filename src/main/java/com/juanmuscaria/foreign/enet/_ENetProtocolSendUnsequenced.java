// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _ENetProtocolSendUnsequenced {
 *     ENetProtocolCommandHeader header;
 *     enet_uint16 unsequencedGroup;
 *     enet_uint16 dataLength;
 * };
 * }
 */
public class _ENetProtocolSendUnsequenced {

    public static MemoryLayout $LAYOUT() {
        return constants$89.const$0;
    }
    public static MemorySegment header$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static VarHandle unsequencedGroup$VH() {
        return constants$89.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enet_uint16 unsequencedGroup;
     * }
     */
    public static short unsequencedGroup$get(MemorySegment seg) {
        return (short)constants$89.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enet_uint16 unsequencedGroup;
     * }
     */
    public static void unsequencedGroup$set(MemorySegment seg, short x) {
        constants$89.const$1.set(seg, x);
    }
    public static short unsequencedGroup$get(MemorySegment seg, long index) {
        return (short)constants$89.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void unsequencedGroup$set(MemorySegment seg, long index, short x) {
        constants$89.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dataLength$VH() {
        return constants$89.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enet_uint16 dataLength;
     * }
     */
    public static short dataLength$get(MemorySegment seg) {
        return (short)constants$89.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enet_uint16 dataLength;
     * }
     */
    public static void dataLength$set(MemorySegment seg, short x) {
        constants$89.const$2.set(seg, x);
    }
    public static short dataLength$get(MemorySegment seg, long index) {
        return (short)constants$89.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dataLength$set(MemorySegment seg, long index, short x) {
        constants$89.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


