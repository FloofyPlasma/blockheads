// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$48 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$48() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("s_addr")
        ).withName("ip_dst"),
        MemoryLayout.sequenceLayout(40, JAVA_BYTE).withName("ip_opts")
    ).withName("ip_opts");
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("ipi_ifindex"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("s_addr")
        ).withName("ipi_spec_dst"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("s_addr")
        ).withName("ipi_addr")
    ).withName("in_pktinfo");
    static final VarHandle const$2 = constants$48.const$1.varHandle(MemoryLayout.PathElement.groupElement("ipi_ifindex"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("__u6_addr8"),
            MemoryLayout.sequenceLayout(8, JAVA_SHORT).withName("__u6_addr16"),
            MemoryLayout.sequenceLayout(4, JAVA_INT).withName("__u6_addr32")
        ).withName("__in6_u")
    ).withName("in6_addr");
    static final UnionLayout const$4 = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("__u6_addr8"),
        MemoryLayout.sequenceLayout(8, JAVA_SHORT).withName("__u6_addr16"),
        MemoryLayout.sequenceLayout(4, JAVA_INT).withName("__u6_addr32")
    ).withName("");
    static final MemorySegment const$5 = RuntimeHelper.lookupGlobalVariable("in6addr_any", constants$48.const$3);
}


