// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$109 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$109() {}
    static final VarHandle const$0 = constants$100.const$2.varHandle(MemoryLayout.PathElement.groupElement("totalWaitingData"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("context"),
        RuntimeHelper.POINTER.withName("compress"),
        RuntimeHelper.POINTER.withName("decompress"),
        RuntimeHelper.POINTER.withName("destroy")
    ).withName("_ENetCompressor");
    static final VarHandle const$2 = constants$109.const$1.varHandle(MemoryLayout.PathElement.groupElement("context"));
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_ENetCompressor.compress.class, "apply", constants$109.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$109.const$3
    );
}


