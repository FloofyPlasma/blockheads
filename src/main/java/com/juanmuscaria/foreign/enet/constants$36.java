// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$36 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$36() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("tz_minuteswest"),
        JAVA_INT.withName("tz_dsttime")
    ).withName("timezone");
    static final VarHandle const$1 = constants$36.const$0.varHandle(MemoryLayout.PathElement.groupElement("tz_minuteswest"));
    static final VarHandle const$2 = constants$36.const$0.varHandle(MemoryLayout.PathElement.groupElement("tz_dsttime"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gettimeofday",
        constants$17.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "settimeofday",
        constants$17.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "adjtime",
        constants$17.const$2
    );
}


