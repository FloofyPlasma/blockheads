// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$29 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$29() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "unsetenv",
        constants$2.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "clearenv",
        constants$18.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "mktemp",
        constants$15.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "mkstemp",
        constants$2.const$0
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "mkstemps",
        constants$29.const$4
    );
}


