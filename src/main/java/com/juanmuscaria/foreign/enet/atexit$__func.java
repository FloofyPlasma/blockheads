// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void (*atexit$__func)();
 * }
 */
public interface atexit$__func {

    void apply();
    static MemorySegment allocate(atexit$__func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$26.const$3, fi, constants$26.const$1, scope);
    }
    static atexit$__func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return () -> {
            try {
                constants$26.const$4.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


