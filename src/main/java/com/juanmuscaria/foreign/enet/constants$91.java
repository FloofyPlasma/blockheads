// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

final class constants$91 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$91() {}
    static final VarHandle const$0 = constants$90.const$5.varHandle(MemoryLayout.PathElement.groupElement("next"));
    static final VarHandle const$1 = constants$90.const$5.varHandle(MemoryLayout.PathElement.groupElement("previous"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("next"),
            RuntimeHelper.POINTER.withName("previous")
        ).withName("sentinel")
    ).withName("_ENetList");
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "enet_list_clear",
        constants$20.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "enet_list_insert",
        constants$30.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "enet_list_remove",
        constants$15.const$4
    );
}


