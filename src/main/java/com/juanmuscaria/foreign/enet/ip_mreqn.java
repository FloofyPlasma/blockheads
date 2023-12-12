// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct ip_mreqn {
 *     struct in_addr imr_multiaddr;
 *     struct in_addr imr_address;
 *     int imr_ifindex;
 * };
 * }
 */
public class ip_mreqn {

    public static MemoryLayout $LAYOUT() {
        return constants$50.const$4;
    }
    public static MemorySegment imr_multiaddr$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static MemorySegment imr_address$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    public static VarHandle imr_ifindex$VH() {
        return constants$50.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int imr_ifindex;
     * }
     */
    public static int imr_ifindex$get(MemorySegment seg) {
        return (int)constants$50.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int imr_ifindex;
     * }
     */
    public static void imr_ifindex$set(MemorySegment seg, int x) {
        constants$50.const$5.set(seg, x);
    }
    public static int imr_ifindex$get(MemorySegment seg, long index) {
        return (int)constants$50.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void imr_ifindex$set(MemorySegment seg, long index, int x) {
        constants$50.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


