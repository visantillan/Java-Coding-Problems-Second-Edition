// Generated by jextract

package c.lib.math;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;

final class constants$0 {

    static final FunctionDescriptor modf$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
            Constants$root.C_DOUBLE$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle modf$MH = RuntimeHelper.downcallHandle(
            "modf",
            constants$0.modf$FUNC
    );
    // Suppresses default constructor, ensuring non-instantiability.
    private constants$0() {
    }
}


