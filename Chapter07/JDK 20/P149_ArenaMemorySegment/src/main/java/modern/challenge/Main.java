package modern.challenge;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentScope;
import java.lang.foreign.ValueLayout;

public class Main {

    public static void main(String[] args) {

        // globalSegment1 and globalSegment2 are never deallocated
        MemorySegment globalSegment1 = MemorySegment.allocateNative(8, SegmentScope.global());
        MemorySegment globalSegment2 = MemorySegment.allocateNative(
                ValueLayout.JAVA_DOUBLE.byteSize(),
                ValueLayout.JAVA_DOUBLE.byteAlignment(), SegmentScope.global());

        // autoSegment1 and autoSegment2 are automatically managed by the garbage collector
        MemorySegment autoSegment1 = MemorySegment.allocateNative(8, SegmentScope.auto());
        MemorySegment autoSegment2 = MemorySegment.allocateNative(
                ValueLayout.JAVA_DOUBLE.byteSize(),
                ValueLayout.JAVA_DOUBLE.byteAlignment(), SegmentScope.auto());

        // arenaSegment1 and arenaSegment2 are available only in the try-with-resource block
        try (Arena arena = Arena.openConfined()) {

            MemorySegment arenaSegment1 = MemorySegment.allocateNative(8, arena.scope());
            MemorySegment arenaSegment2 = MemorySegment.allocateNative(
                    ValueLayout.JAVA_DOUBLE.byteSize(),
                    ValueLayout.JAVA_DOUBLE.byteAlignment(), arena.scope());
        }

        try (Arena arena = Arena.openConfined()) {

            // already has arena's scope
            MemorySegment segment1i1 = arena.allocate(4);
            MemorySegment segment1i2 = arena.allocate(ValueLayout.JAVA_INT.byteSize());
            MemorySegment segment1i3 = arena.allocate(ValueLayout.JAVA_INT, Integer.MAX_VALUE);
            MemorySegment segment1d = arena.allocate(ValueLayout.JAVA_DOUBLE.byteSize(),
                    ValueLayout.JAVA_DOUBLE.byteAlignment());
            MemorySegment segment1a1 = arena.allocate(ValueLayout.JAVA_CHAR);
            MemorySegment segment1a2 = arena.allocate(ValueLayout.JAVA_CHAR, 'a');
            MemorySegment segment1s = arena.allocateUtf8String("abcd");

            segment1i1.set(ValueLayout.JAVA_INT, 0, Integer.MAX_VALUE);
            segment1i2.set(ValueLayout.JAVA_INT, 0, Integer.MAX_VALUE);
            segment1d.set(ValueLayout.JAVA_DOUBLE, 0, Double.MIN_VALUE);
            segment1a1.setAtIndex(ValueLayout.JAVA_CHAR, 0, 'a');

            MemorySegment segment2i1 = MemorySegment.allocateNative(4, arena.scope());
            MemorySegment segment2i2 = MemorySegment.allocateNative(ValueLayout.JAVA_INT, arena.scope());
            MemorySegment segment2d = MemorySegment.allocateNative(
                    ValueLayout.JAVA_DOUBLE.byteSize(),
                    ValueLayout.JAVA_DOUBLE.byteAlignment(), arena.scope());
            MemorySegment segment2a1 = MemorySegment.allocateNative(2, arena.scope());
            MemorySegment segment2a2 = MemorySegment.allocateNative(
                    ValueLayout.JAVA_CHAR.byteSize(), arena.scope());
            MemorySegment segment2s = MemorySegment.allocateNative(5, arena.scope()); // "abcd".length() + 1 = 5

            segment2i1.set(ValueLayout.JAVA_INT, 0, Integer.MAX_VALUE);
            segment2i2.setAtIndex(ValueLayout.JAVA_INT, 0, Integer.MAX_VALUE);
            segment2d.set(ValueLayout.JAVA_DOUBLE, 0, Double.MAX_VALUE);
            segment2a1.set(ValueLayout.JAVA_CHAR, 0, 'a');
            segment2a2.set(ValueLayout.JAVA_CHAR, 0, 'a');
            segment2s.setUtf8String(0, "abcd");

            System.out.println("Segment 1i1: " + segment1i1);
            System.out.println("Segment 1i1 content: " + segment1i1.get(ValueLayout.JAVA_INT, 0));

            System.out.println("Segment 1i2: " + segment1i2);
            System.out.println("Segment 1i2 content: " + segment1i2.get(ValueLayout.JAVA_INT, 0));

            System.out.println("Segment 1i3: " + segment1i3);
            System.out.println("Segment 1i3 content: " + segment1i3.get(ValueLayout.JAVA_INT, 0));

            System.out.println("Segment 2i1: " + segment2i1);
            System.out.println("Segment 2i1 content: " + segment2i1.get(ValueLayout.JAVA_INT, 0));

            System.out.println("Segment 2i2: " + segment2i2);
            System.out.println("Segment 2i2 content: " + segment2i2.get(ValueLayout.JAVA_INT, 0));

            System.out.println("Segment 1s: " + segment1s);
            System.out.println("Segment 1s content: " + segment1s.getUtf8String(0));

            System.out.println("Segment 2s: " + segment2s);
            System.out.println("Segment 2s content: " + segment2s.getUtf8String(0));

            System.out.println("Segment 1d: " + segment1d);
            System.out.println("Segment 1d content: " + segment1d.get(ValueLayout.JAVA_DOUBLE, 0));

            System.out.println("Segment 2d: " + segment2d);
            System.out.println("Segment 2d content: " + segment2d.get(ValueLayout.JAVA_DOUBLE, 0));

            System.out.println("Segment 1a1: " + segment1a1);
            System.out.println("Segment 1a1 content: " + segment1a1.get(ValueLayout.JAVA_CHAR, 0));

            System.out.println("Segment 1a2: " + segment1a2);
            System.out.println("Segment 1a2 content: " + segment1a2.get(ValueLayout.JAVA_CHAR, 0));

            System.out.println("Segment 2a1: " + segment2a1);
            System.out.println("Segment 2a1 content: " + segment2a1.getAtIndex(ValueLayout.JAVA_CHAR, 0));

            System.out.println("Segment 2a2: " + segment2a2);
            System.out.println("Segment 2a2 content: " + segment2a2.getAtIndex(ValueLayout.JAVA_CHAR, 0));
        }
    }
}