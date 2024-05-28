// Generated by jextract

package c.lib.math;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;

/**
 * {@snippet :
 * struct _complex {
 *     double x;
 *     double y;
 * };
 *}
 */
public class _complex {

    public static MemoryLayout $LAYOUT() {
        return constants$17.const$0;
    }

    public static VarHandle x$VH() {
        return constants$17.const$1;
    }

    /**
     * Getter for field:
     * {@snippet :
     * double x;
     *}
     */
    public static double x$get(MemorySegment seg) {
        return (double) constants$17.const$1.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * double x;
     *}
     */
    public static void x$set(MemorySegment seg, double x) {
        constants$17.const$1.set(seg, x);
    }

    public static double x$get(MemorySegment seg, long index) {
        return (double) constants$17.const$1.get(seg.asSlice(index * sizeof()));
    }

    public static void x$set(MemorySegment seg, long index, double x) {
        constants$17.const$1.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle y$VH() {
        return constants$17.const$2;
    }

    /**
     * Getter for field:
     * {@snippet :
     * double y;
     *}
     */
    public static double y$get(MemorySegment seg) {
        return (double) constants$17.const$2.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * double y;
     *}
     */
    public static void y$set(MemorySegment seg, double x) {
        constants$17.const$2.set(seg, x);
    }

    public static double y$get(MemorySegment seg, long index) {
        return (double) constants$17.const$2.get(seg.asSlice(index * sizeof()));
    }

    public static void y$set(MemorySegment seg, long index, double x) {
        constants$17.const$2.set(seg.asSlice(index * sizeof()), x);
    }

    public static long sizeof() {
        return $LAYOUT().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate($LAYOUT());
    }

    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }

    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) {
        return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena);
    }
}


