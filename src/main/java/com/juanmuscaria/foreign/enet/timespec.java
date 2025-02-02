// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct timespec {
 *     __time_t tv_sec;
 *     __syscall_slong_t tv_nsec;
 * };
 * }
 */
public class timespec {

    public static MemoryLayout $LAYOUT() {
        return constants$5.const$5;
    }
    public static VarHandle tv_sec$VH() {
        return constants$6.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __time_t tv_sec;
     * }
     */
    public static long tv_sec$get(MemorySegment seg) {
        return (long)constants$6.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __time_t tv_sec;
     * }
     */
    public static void tv_sec$set(MemorySegment seg, long x) {
        constants$6.const$0.set(seg, x);
    }
    public static long tv_sec$get(MemorySegment seg, long index) {
        return (long)constants$6.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void tv_sec$set(MemorySegment seg, long index, long x) {
        constants$6.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle tv_nsec$VH() {
        return constants$6.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __syscall_slong_t tv_nsec;
     * }
     */
    public static long tv_nsec$get(MemorySegment seg) {
        return (long)constants$6.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __syscall_slong_t tv_nsec;
     * }
     */
    public static void tv_nsec$set(MemorySegment seg, long x) {
        constants$6.const$1.set(seg, x);
    }
    public static long tv_nsec$get(MemorySegment seg, long index) {
        return (long)constants$6.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void tv_nsec$set(MemorySegment seg, long index, long x) {
        constants$6.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


