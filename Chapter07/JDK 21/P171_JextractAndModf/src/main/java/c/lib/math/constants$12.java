// Generated by jextract

package c.lib.math;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;

final class constants$12 {

    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_DOUBLE,
            JAVA_DOUBLE,
            JAVA_DOUBLE
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
            "atan2",
            constants$12.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
            "exp",
            constants$10.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
            "log",
            constants$10.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
            "log10",
            constants$10.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
            "pow",
            constants$12.const$0
    );
    // Suppresses default constructor, ensuring non-instantiability.
    private constants$12() {
    }
}


