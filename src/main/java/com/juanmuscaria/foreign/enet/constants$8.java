// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$8 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$8() {}
    static final VarHandle const$0 = constants$7.const$5.varHandle(MemoryLayout.PathElement.groupElement("__prev"));
    static final VarHandle const$1 = constants$7.const$5.varHandle(MemoryLayout.PathElement.groupElement("__next"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("__next")
    ).withName("__pthread_internal_slist");
    static final VarHandle const$3 = constants$8.const$2.varHandle(MemoryLayout.PathElement.groupElement("__next"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("__lock"),
        JAVA_INT.withName("__count"),
        JAVA_INT.withName("__owner"),
        JAVA_INT.withName("__nusers"),
        JAVA_INT.withName("__kind"),
        JAVA_SHORT.withName("__spins"),
        JAVA_SHORT.withName("__elision"),
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("__prev"),
            RuntimeHelper.POINTER.withName("__next")
        ).withName("__list")
    ).withName("__pthread_mutex_s");
    static final VarHandle const$5 = constants$8.const$4.varHandle(MemoryLayout.PathElement.groupElement("__lock"));
}


