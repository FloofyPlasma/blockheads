// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$89 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$89() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_BYTE.withName("command"),
            JAVA_BYTE.withName("channelID"),
            JAVA_SHORT.withByteAlignment(1).withName("reliableSequenceNumber")
        ).withName("header"),
        JAVA_SHORT.withByteAlignment(1).withName("unsequencedGroup"),
        JAVA_SHORT.withByteAlignment(1).withName("dataLength")
    ).withName("_ENetProtocolSendUnsequenced");
    static final VarHandle const$1 = constants$89.const$0.varHandle(MemoryLayout.PathElement.groupElement("unsequencedGroup"));
    static final VarHandle const$2 = constants$89.const$0.varHandle(MemoryLayout.PathElement.groupElement("dataLength"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_BYTE.withName("command"),
            JAVA_BYTE.withName("channelID"),
            JAVA_SHORT.withByteAlignment(1).withName("reliableSequenceNumber")
        ).withName("header"),
        JAVA_SHORT.withByteAlignment(1).withName("startSequenceNumber"),
        JAVA_SHORT.withByteAlignment(1).withName("dataLength"),
        JAVA_INT.withByteAlignment(1).withName("fragmentCount"),
        JAVA_INT.withByteAlignment(1).withName("fragmentNumber"),
        JAVA_INT.withByteAlignment(1).withName("totalLength"),
        JAVA_INT.withByteAlignment(1).withName("fragmentOffset")
    ).withName("_ENetProtocolSendFragment");
    static final VarHandle const$4 = constants$89.const$3.varHandle(MemoryLayout.PathElement.groupElement("startSequenceNumber"));
    static final VarHandle const$5 = constants$89.const$3.varHandle(MemoryLayout.PathElement.groupElement("dataLength"));
}


