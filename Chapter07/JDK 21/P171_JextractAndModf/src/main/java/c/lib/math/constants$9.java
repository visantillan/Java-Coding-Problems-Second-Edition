// Generated by jextract

package c.lib.math;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;

final class constants$9 {

    static final FunctionDescriptor const$0 = FunctionDescriptor.ofVoid(
            JAVA_INT,
            RuntimeHelper.POINTER,
            JAVA_DOUBLE,
            JAVA_DOUBLE,
            JAVA_DOUBLE
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
            "__mingw_raise_matherr",
            constants$9.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
            RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(__mingw_setusermatherr$x0.class, "apply", constants$9.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
            constants$9.const$2
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.ofVoid(
            RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
            "__mingw_setusermatherr",
            constants$9.const$5
    );
    // Suppresses default constructor, ensuring non-instantiability.
    private constants$9() {
    }
}


