// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.foreign.*;

/**
 * {@snippet :
 * int (*ENetInterceptCallback)(struct _ENetHost* host,struct _ENetEvent* event);
 * }
 */
public interface ENetInterceptCallback {

    int apply(java.lang.foreign.MemorySegment host, java.lang.foreign.MemorySegment event);
    static MemorySegment allocate(ENetInterceptCallback fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$111.const$3, fi, constants$17.const$2, scope);
    }
    static ENetInterceptCallback ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _host, java.lang.foreign.MemorySegment _event) -> {
            try {
                return (int)constants$30.const$5.invokeExact(symbol, _host, _event);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


