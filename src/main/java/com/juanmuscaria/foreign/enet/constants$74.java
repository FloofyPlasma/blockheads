// Generated by jextract

package com.juanmuscaria.foreign.enet;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$74 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$74() {}
    static final MemorySegment const$0 = RuntimeHelper.lookupGlobalVariable("optopt", JAVA_INT);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "getopt",
        constants$37.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gethostname",
        constants$34.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "sethostname",
        constants$34.const$1
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "sethostid",
        constants$74.const$4
    );
}


