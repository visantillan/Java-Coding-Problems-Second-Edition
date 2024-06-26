// Generated by jextract

package c.lib.math;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;

/**
 * {@snippet :
 * union __mingw_ldbl_type_t {
 *     long double x;
 *     struct  lh;
 * };
 *}
 */
public class __mingw_ldbl_type_t {

    public static MemoryLayout $LAYOUT() {
        return constants$5.const$4;
    }

    public static VarHandle x$VH() {
        return constants$5.const$5;
    }

    /**
     * Getter for field:
     * {@snippet :
     * long double x;
     *}
     */
    public static double x$get(MemorySegment seg) {
        return (double) constants$5.const$5.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * long double x;
     *}
     */
    public static void x$set(MemorySegment seg, double x) {
        constants$5.const$5.set(seg, x);
    }

    public static double x$get(MemorySegment seg, long index) {
        return (double) constants$5.const$5.get(seg.asSlice(index * sizeof()));
    }

    public static void x$set(MemorySegment seg, long index, double x) {
        constants$5.const$5.set(seg.asSlice(index * sizeof()), x);
    }

    public static MemorySegment lh$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
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

    /**
     * {@snippet :
     * struct {
     *     unsigned int low;
     *     unsigned int high;
     *          *     int sign_exponent;
     *     int res1;
     *     int res0;
     * };
     *}
     */
    public static final class lh {

        // Suppresses default constructor, ensuring non-instantiability.
        private lh() {
        }

        public static MemoryLayout $LAYOUT() {
            return constants$6.const$0;
        }

        public static VarHandle low$VH() {
            return constants$6.const$1;
        }

        /**
         * Getter for field:
         * {@snippet :
         * unsigned int low;
         *}
         */
        public static int low$get(MemorySegment seg) {
            return (int) constants$6.const$1.get(seg);
        }

        /**
         * Setter for field:
         * {@snippet :
         * unsigned int low;
         *}
         */
        public static void low$set(MemorySegment seg, int x) {
            constants$6.const$1.set(seg, x);
        }

        public static int low$get(MemorySegment seg, long index) {
            return (int) constants$6.const$1.get(seg.asSlice(index * sizeof()));
        }

        public static void low$set(MemorySegment seg, long index, int x) {
            constants$6.const$1.set(seg.asSlice(index * sizeof()), x);
        }

        public static VarHandle high$VH() {
            return constants$6.const$2;
        }

        /**
         * Getter for field:
         * {@snippet :
         * unsigned int high;
         *}
         */
        public static int high$get(MemorySegment seg) {
            return (int) constants$6.const$2.get(seg);
        }

        /**
         * Setter for field:
         * {@snippet :
         * unsigned int high;
         *}
         */
        public static void high$set(MemorySegment seg, int x) {
            constants$6.const$2.set(seg, x);
        }

        public static int high$get(MemorySegment seg, long index) {
            return (int) constants$6.const$2.get(seg.asSlice(index * sizeof()));
        }

        public static void high$set(MemorySegment seg, long index, int x) {
            constants$6.const$2.set(seg.asSlice(index * sizeof()), x);
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
}


