// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$40 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$40() {}
    static final VarHandle const$0 = constants$39.const$3.varHandle(MemoryLayout.PathElement.groupElement("msg_iov"));
    static final VarHandle const$1 = constants$39.const$3.varHandle(MemoryLayout.PathElement.groupElement("msg_iovlen"));
    static final VarHandle const$2 = constants$39.const$3.varHandle(MemoryLayout.PathElement.groupElement("msg_control"));
    static final VarHandle const$3 = constants$39.const$3.varHandle(MemoryLayout.PathElement.groupElement("msg_controllen"));
    static final VarHandle const$4 = constants$39.const$3.varHandle(MemoryLayout.PathElement.groupElement("msg_flags"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_LONG.withName("cmsg_len"),
        JAVA_INT.withName("cmsg_level"),
        JAVA_INT.withName("cmsg_type"),
        MemoryLayout.sequenceLayout(0, JAVA_BYTE).withName("__cmsg_data")
    ).withName("cmsghdr");
}


