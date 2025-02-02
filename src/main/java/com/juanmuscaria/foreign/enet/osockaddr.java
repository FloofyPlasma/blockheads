// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct osockaddr {
 *     unsigned short sa_family;
 *     unsigned char sa_data[14];
 * };
 * }
 */
public class osockaddr {

    public static MemoryLayout $LAYOUT() {
        return constants$42.const$5;
    }
    public static VarHandle sa_family$VH() {
        return constants$43.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short sa_family;
     * }
     */
    public static short sa_family$get(MemorySegment seg) {
        return (short)constants$43.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short sa_family;
     * }
     */
    public static void sa_family$set(MemorySegment seg, short x) {
        constants$43.const$0.set(seg, x);
    }
    public static short sa_family$get(MemorySegment seg, long index) {
        return (short)constants$43.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void sa_family$set(MemorySegment seg, long index, short x) {
        constants$43.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment sa_data$slice(MemorySegment seg) {
        return seg.asSlice(2, 14);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


