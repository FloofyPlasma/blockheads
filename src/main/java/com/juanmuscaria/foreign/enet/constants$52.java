// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$52 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$52() {}
    static final VarHandle const$0 = constants$51.const$5.varHandle(MemoryLayout.PathElement.groupElement("gsr_interface"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("s_addr")
        ).withName("imsf_multiaddr"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("s_addr")
        ).withName("imsf_interface"),
        JAVA_INT.withName("imsf_fmode"),
        JAVA_INT.withName("imsf_numsrc"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            JAVA_INT.withName("s_addr")
        ).withName("in_addr")).withName("imsf_slist")
    ).withName("ip_msfilter");
    static final VarHandle const$2 = constants$52.const$1.varHandle(MemoryLayout.PathElement.groupElement("imsf_fmode"));
    static final VarHandle const$3 = constants$52.const$1.varHandle(MemoryLayout.PathElement.groupElement("imsf_numsrc"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("gf_interface"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.structLayout(
            JAVA_SHORT.withName("ss_family"),
            MemoryLayout.sequenceLayout(118, JAVA_BYTE).withName("__ss_padding"),
            JAVA_LONG.withName("__ss_align")
        ).withName("gf_group"),
        JAVA_INT.withName("gf_fmode"),
        JAVA_INT.withName("gf_numsrc"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            JAVA_SHORT.withName("ss_family"),
            MemoryLayout.sequenceLayout(118, JAVA_BYTE).withName("__ss_padding"),
            JAVA_LONG.withName("__ss_align")
        ).withName("sockaddr_storage")).withName("gf_slist")
    ).withName("group_filter");
    static final VarHandle const$5 = constants$52.const$4.varHandle(MemoryLayout.PathElement.groupElement("gf_interface"));
}


