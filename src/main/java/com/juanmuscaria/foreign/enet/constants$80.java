// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$80 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$80() {}
    static final VarHandle const$0 = constants$79.const$5.varHandle(MemoryLayout.PathElement.groupElement("data"));
    static final VarHandle const$1 = constants$79.const$5.varHandle(MemoryLayout.PathElement.groupElement("dataLength"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_SHORT.withByteAlignment(1).withName("peerID"),
        JAVA_SHORT.withByteAlignment(1).withName("sentTime")
    ).withName("_ENetProtocolHeader");
    static final VarHandle const$3 = constants$80.const$2.varHandle(MemoryLayout.PathElement.groupElement("peerID"));
    static final VarHandle const$4 = constants$80.const$2.varHandle(MemoryLayout.PathElement.groupElement("sentTime"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_BYTE.withName("command"),
        JAVA_BYTE.withName("channelID"),
        JAVA_SHORT.withByteAlignment(1).withName("reliableSequenceNumber")
    ).withName("_ENetProtocolCommandHeader");
}


