// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$57 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$57() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "inet_net_pton",
        constants$57.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "inet_nsap_addr",
        constants$28.const$5
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "inet_nsap_ntoa",
        constants$57.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "access",
        constants$29.const$4
    );
}


