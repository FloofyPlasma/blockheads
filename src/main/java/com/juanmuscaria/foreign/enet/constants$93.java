// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

final class constants$93 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$93() {}
    static final VarHandle const$0 = constants$92.const$3.varHandle(MemoryLayout.PathElement.groupElement("malloc"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_ENetCallbacks.free.class, "apply", constants$20.const$5);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$20.const$5
    );
    static final VarHandle const$3 = constants$92.const$3.varHandle(MemoryLayout.PathElement.groupElement("free"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_ENetCallbacks.no_memory.class, "apply", constants$26.const$1);
    static final VarHandle const$5 = constants$92.const$3.varHandle(MemoryLayout.PathElement.groupElement("no_memory"));
}


