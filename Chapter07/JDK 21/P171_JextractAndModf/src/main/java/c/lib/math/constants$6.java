// Generated by jextract

package c.lib.math;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;

final class constants$6 {

    static final StructLayout const$0 = MemoryLayout.structLayout(
            JAVA_INT.withName("low"),
            JAVA_INT.withName("high"),
            MemoryLayout.paddingLayout(8)
    ).withName("");
    static final VarHandle const$1 = constants$6.const$0.varHandle(MemoryLayout.PathElement.groupElement("low"));
    static final VarHandle const$2 = constants$6.const$0.varHandle(MemoryLayout.PathElement.groupElement("high"));
    static final UnionLayout const$3 = MemoryLayout.unionLayout(
            RuntimeHelper.POINTER.withName("ld"),
            RuntimeHelper.POINTER.withName("d"),
            RuntimeHelper.POINTER.withName("f"),
            RuntimeHelper.POINTER.withName("ldt"),
            RuntimeHelper.POINTER.withName("dt"),
            RuntimeHelper.POINTER.withName("ft")
    ).withName("__mingw_fp_types_t");
    static final VarHandle const$4 = constants$6.const$3.varHandle(MemoryLayout.PathElement.groupElement("ld"));
    static final VarHandle const$5 = constants$6.const$3.varHandle(MemoryLayout.PathElement.groupElement("d"));
    // Suppresses default constructor, ensuring non-instantiability.
    private constants$6() {
    }
}


