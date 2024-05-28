package modern.challenge;

import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

public class Main {

    public static void main(String[] args) throws IOException {

        try (Arena arena = new MappedArena("readme")) {

            MemorySegment segment1 = arena.allocate(100);
            MemorySegment segment2 = arena.allocate(50);

            segment1.setUtf8String(0, "Hello");
            segment2.setUtf8String(0, "World");

            System.out.println(segment1.getUtf8String(0)
                    + " " + segment2.getUtf8String(0));
        }

        System.out.println("\n\nYou should find the files on disk in the project's root");
    }
}