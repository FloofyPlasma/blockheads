// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$92 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$92() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "enet_list_move",
        constants$92.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "enet_list_size",
        constants$2.const$2
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("malloc"),
        RuntimeHelper.POINTER.withName("free"),
        RuntimeHelper.POINTER.withName("no_memory")
    ).withName("_ENetCallbacks");
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_ENetCallbacks.malloc.class, "apply", constants$4.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$4.const$3
    );
}


