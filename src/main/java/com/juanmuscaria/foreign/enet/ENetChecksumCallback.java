// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.foreign.*;

/**
 * {@snippet :
 * unsigned int (*ENetChecksumCallback)(struct * buffers,unsigned long bufferCount);
 * }
 */
public interface ENetChecksumCallback {

    int apply(java.lang.foreign.MemorySegment buffers, long bufferCount);
    static MemorySegment allocate(ENetChecksumCallback fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$111.const$1, fi, constants$34.const$1, scope);
    }
    static ENetChecksumCallback ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _buffers, long _bufferCount) -> {
            try {
                return (int)constants$111.const$2.invokeExact(symbol, _buffers, _bufferCount);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


