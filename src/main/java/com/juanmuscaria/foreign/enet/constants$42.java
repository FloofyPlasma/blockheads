// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$42 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$42() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$15.const$0
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(2, JAVA_INT).withName("val")
    ).withName("");
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("l_onoff"),
        JAVA_INT.withName("l_linger")
    ).withName("linger");
    static final VarHandle const$3 = constants$42.const$2.varHandle(MemoryLayout.PathElement.groupElement("l_onoff"));
    static final VarHandle const$4 = constants$42.const$2.varHandle(MemoryLayout.PathElement.groupElement("l_linger"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("sa_family"),
        MemoryLayout.sequenceLayout(14, JAVA_BYTE).withName("sa_data")
    ).withName("osockaddr");
}


