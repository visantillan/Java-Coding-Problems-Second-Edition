package modern.challenge;

import org.openjdk.jmh.annotations.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.AverageTime)
@Fork(value = 1, warmups = 0)
@Measurement(iterations = 90, time = 1)
@State(Scope.Benchmark)
public class Main {

    private static String str1;
    private static String str2;
    private static String str3;
    private static String str4;

    private static List<String> strs;

    @Setup
    public static void setup() {

        str1 = "hello";
        str2 = "my";
        str3 = "dear";
        str4 = "friend";

        strs = Arrays.asList("hello", "my", "dear", "friend");
    }

    @Benchmark
    public static String concatViaPlus() {

        return str1 + str2 + str3 + str4;
    }

    @Benchmark
    public static String concatViaStringBuilder() {

        StringBuilder sb = new StringBuilder();

        sb.append(str1)
                .append(str2)
                .append(str3)
                .append(str4);

        return sb.toString();
    }

    @Benchmark
    public static String concatListViaPlus() {

        String result = "";
        for (String str : strs) {
            result = result + str;
        }

        return result;
    }

    @Benchmark
    public static String concatListViaStringBuilder() {

        StringBuilder result = new StringBuilder();

        for (String str : strs) {
            result.append(str);
        }

        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        org.openjdk.jmh.Main.main(args);
    }
}
