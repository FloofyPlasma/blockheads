// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct sockaddr_storage {
 *     sa_family_t ss_family;
 *     char __ss_padding[118];
 *     unsigned long __ss_align;
 * };
 * }
 */
public class sockaddr_storage {

    public static MemoryLayout $LAYOUT() {
        return constants$39.const$0;
    }
    public static VarHandle ss_family$VH() {
        return constants$39.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * sa_family_t ss_family;
     * }
     */
    public static short ss_family$get(MemorySegment seg) {
        return (short)constants$39.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * sa_family_t ss_family;
     * }
     */
    public static void ss_family$set(MemorySegment seg, short x) {
        constants$39.const$1.set(seg, x);
    }
    public static short ss_family$get(MemorySegment seg, long index) {
        return (short)constants$39.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void ss_family$set(MemorySegment seg, long index, short x) {
        constants$39.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __ss_padding$slice(MemorySegment seg) {
        return seg.asSlice(2, 118);
    }
    public static VarHandle __ss_align$VH() {
        return constants$39.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long __ss_align;
     * }
     */
    public static long __ss_align$get(MemorySegment seg) {
        return (long)constants$39.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long __ss_align;
     * }
     */
    public static void __ss_align$set(MemorySegment seg, long x) {
        constants$39.const$2.set(seg, x);
    }
    public static long __ss_align$get(MemorySegment seg, long index) {
        return (long)constants$39.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void __ss_align$set(MemorySegment seg, long index, long x) {
        constants$39.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


