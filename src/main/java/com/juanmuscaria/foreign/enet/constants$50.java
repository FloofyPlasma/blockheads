// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$50 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$50() {}
    static final VarHandle const$0 = constants$49.const$4.varHandle(MemoryLayout.PathElement.groupElement("sin6_port"));
    static final VarHandle const$1 = constants$49.const$4.varHandle(MemoryLayout.PathElement.groupElement("sin6_flowinfo"));
    static final VarHandle const$2 = constants$49.const$4.varHandle(MemoryLayout.PathElement.groupElement("sin6_scope_id"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("s_addr")
        ).withName("imr_multiaddr"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("s_addr")
        ).withName("imr_interface")
    ).withName("ip_mreq");
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("s_addr")
        ).withName("imr_multiaddr"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("s_addr")
        ).withName("imr_address"),
        JAVA_INT.withName("imr_ifindex")
    ).withName("ip_mreqn");
    static final VarHandle const$5 = constants$50.const$4.varHandle(MemoryLayout.PathElement.groupElement("imr_ifindex"));
}


