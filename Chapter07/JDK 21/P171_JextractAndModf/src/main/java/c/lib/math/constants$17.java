// Generated by jextract

package c.lib.math;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;

final class constants$17 {

    static final StructLayout const$0 = MemoryLayout.structLayout(
            JAVA_DOUBLE.withName("x"),
            JAVA_DOUBLE.withName("y")
    ).withName("_complex");
    static final VarHandle const$1 = constants$17.const$0.varHandle(MemoryLayout.PathElement.groupElement("x"));
    static final VarHandle const$2 = constants$17.const$0.varHandle(MemoryLayout.PathElement.groupElement("y"));
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_DOUBLE,
            MemoryLayout.structLayout(
                    JAVA_DOUBLE.withName("x"),
                    JAVA_DOUBLE.withName("y")
            ).withName("_complex")
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
            "_cabs",
            constants$17.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
            "_hypot",
            constants$12.const$0
    );
    // Suppresses default constructor, ensuring non-instantiability.
    private constants$17() {
    }
}


