// Generated by jextract

package c.lib.math;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;

/**
 * {@snippet :
 * struct tagLC_ID {
 *     unsigned short wLanguage;
 *     unsigned short wCountry;
 *     unsigned short wCodePage;
 * };
 *}
 */
public class tagLC_ID {

    public static MemoryLayout $LAYOUT() {
        return constants$0.const$5;
    }

    public static VarHandle wLanguage$VH() {
        return constants$1.const$0;
    }

    /**
     * Getter for field:
     * {@snippet :
     * unsigned short wLanguage;
     *}
     */
    public static short wLanguage$get(MemorySegment seg) {
        return (short) constants$1.const$0.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * unsigned short wLanguage;
     *}
     */
    public static void wLanguage$set(MemorySegment seg, short x) {
        constants$1.const$0.set(seg, x);
    }

    public static short wLanguage$get(MemorySegment seg, long index) {
        return (short) constants$1.const$0.get(seg.asSlice(index * sizeof()));
    }

    public static void wLanguage$set(MemorySegment seg, long index, short x) {
        constants$1.const$0.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle wCountry$VH() {
        return constants$1.const$1;
    }

    /**
     * Getter for field:
     * {@snippet :
     * unsigned short wCountry;
     *}
     */
    public static short wCountry$get(MemorySegment seg) {
        return (short) constants$1.const$1.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * unsigned short wCountry;
     *}
     */
    public static void wCountry$set(MemorySegment seg, short x) {
        constants$1.const$1.set(seg, x);
    }

    public static short wCountry$get(MemorySegment seg, long index) {
        return (short) constants$1.const$1.get(seg.asSlice(index * sizeof()));
    }

    public static void wCountry$set(MemorySegment seg, long index, short x) {
        constants$1.const$1.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle wCodePage$VH() {
        return constants$1.const$2;
    }

    /**
     * Getter for field:
     * {@snippet :
     * unsigned short wCodePage;
     *}
     */
    public static short wCodePage$get(MemorySegment seg) {
        return (short) constants$1.const$2.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * unsigned short wCodePage;
     *}
     */
    public static void wCodePage$set(MemorySegment seg, short x) {
        constants$1.const$2.set(seg, x);
    }

    public static short wCodePage$get(MemorySegment seg, long index) {
        return (short) constants$1.const$2.get(seg.asSlice(index * sizeof()));
    }

    public static void wCodePage$set(MemorySegment seg, long index, short x) {
        constants$1.const$2.set(seg.asSlice(index * sizeof()), x);
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


