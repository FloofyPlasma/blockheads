// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$59 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$59() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "read",
        constants$59.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "write",
        constants$59.const$0
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_LONG
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "pread",
        constants$59.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "pwrite",
        constants$59.const$3
    );
}


