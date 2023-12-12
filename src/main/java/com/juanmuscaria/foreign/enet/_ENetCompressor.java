// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _ENetCompressor {
 *     void* context;
 *     size_t (*compress)(void*,const ENetBuffer*,size_t,size_t,enet_uint8*,size_t);
 *     size_t (*decompress)(void*,const enet_uint8*,size_t,enet_uint8*,size_t);
 *     void (*destroy)(void*);
 * };
 * }
 */
public class _ENetCompressor {

    public static MemoryLayout $LAYOUT() {
        return constants$109.const$1;
    }
    public static VarHandle context$VH() {
        return constants$109.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* context;
     * }
     */
    public static MemorySegment context$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$109.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* context;
     * }
     */
    public static void context$set(MemorySegment seg, MemorySegment x) {
        constants$109.const$2.set(seg, x);
    }
    public static MemorySegment context$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$109.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void context$set(MemorySegment seg, long index, MemorySegment x) {
        constants$109.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * size_t (*compress)(void*,const ENetBuffer*,size_t,size_t,enet_uint8*,size_t);
     * }
     */
    public interface compress {

        long apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, long _x2, long _x3, java.lang.foreign.MemorySegment _x4, long _x5);
        static MemorySegment allocate(compress fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$109.const$4, fi, constants$109.const$3, scope);
        }
        static compress ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, long __x2, long __x3, java.lang.foreign.MemorySegment __x4, long __x5) -> {
                try {
                    return (long)constants$109.const$5.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle compress$VH() {
        return constants$110.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t (*compress)(void*,const ENetBuffer*,size_t,size_t,enet_uint8*,size_t);
     * }
     */
    public static MemorySegment compress$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$110.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t (*compress)(void*,const ENetBuffer*,size_t,size_t,enet_uint8*,size_t);
     * }
     */
    public static void compress$set(MemorySegment seg, MemorySegment x) {
        constants$110.const$0.set(seg, x);
    }
    public static MemorySegment compress$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$110.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void compress$set(MemorySegment seg, long index, MemorySegment x) {
        constants$110.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static compress compress(MemorySegment segment, Arena scope) {
        return compress.ofAddress(compress$get(segment), scope);
    }
    /**
     * {@snippet :
 * size_t (*decompress)(void*,const enet_uint8*,size_t,enet_uint8*,size_t);
     * }
     */
    public interface decompress {

        long apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, long _x2, java.lang.foreign.MemorySegment _x3, long _x4);
        static MemorySegment allocate(decompress fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$110.const$2, fi, constants$110.const$1, scope);
        }
        static decompress ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, long __x2, java.lang.foreign.MemorySegment __x3, long __x4) -> {
                try {
                    return (long)constants$110.const$3.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle decompress$VH() {
        return constants$110.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t (*decompress)(void*,const enet_uint8*,size_t,enet_uint8*,size_t);
     * }
     */
    public static MemorySegment decompress$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$110.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t (*decompress)(void*,const enet_uint8*,size_t,enet_uint8*,size_t);
     * }
     */
    public static void decompress$set(MemorySegment seg, MemorySegment x) {
        constants$110.const$4.set(seg, x);
    }
    public static MemorySegment decompress$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$110.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void decompress$set(MemorySegment seg, long index, MemorySegment x) {
        constants$110.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static decompress decompress(MemorySegment segment, Arena scope) {
        return decompress.ofAddress(decompress$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*destroy)(void*);
     * }
     */
    public interface destroy {

        void apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(destroy fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$110.const$5, fi, constants$20.const$5, scope);
        }
        static destroy ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    constants$93.const$2.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle destroy$VH() {
        return constants$111.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*destroy)(void*);
     * }
     */
    public static MemorySegment destroy$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$111.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*destroy)(void*);
     * }
     */
    public static void destroy$set(MemorySegment seg, MemorySegment x) {
        constants$111.const$0.set(seg, x);
    }
    public static MemorySegment destroy$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$111.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void destroy$set(MemorySegment seg, long index, MemorySegment x) {
        constants$111.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static destroy destroy(MemorySegment segment, Arena scope) {
        return destroy.ofAddress(destroy$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


