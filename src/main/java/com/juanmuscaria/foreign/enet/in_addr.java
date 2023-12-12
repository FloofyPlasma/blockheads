// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct in_addr {
 *     in_addr_t s_addr;
 * };
 * }
 */
public class in_addr {

    public static MemoryLayout $LAYOUT() {
        return constants$47.const$4;
    }
    public static VarHandle s_addr$VH() {
        return constants$47.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * in_addr_t s_addr;
     * }
     */
    public static int s_addr$get(MemorySegment seg) {
        return (int)constants$47.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * in_addr_t s_addr;
     * }
     */
    public static void s_addr$set(MemorySegment seg, int x) {
        constants$47.const$5.set(seg, x);
    }
    public static int s_addr$get(MemorySegment seg, long index) {
        return (int)constants$47.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void s_addr$set(MemorySegment seg, long index, int x) {
        constants$47.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


