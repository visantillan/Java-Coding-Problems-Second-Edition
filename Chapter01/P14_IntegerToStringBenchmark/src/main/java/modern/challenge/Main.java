package modern.challenge;

import org.openjdk.jmh.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.AverageTime)
@Fork(value = 1, warmups = 0)
@Measurement(iterations = 20, time = 1)
@State(Scope.Benchmark)
public class Main {

    private int v;
    private Integer vo;

    public static void main(String[] args) throws IOException {
        org.openjdk.jmh.Main.main(args);
    }

    @Setup
    public void setup() {

        v = 948822;
        vo = Integer.valueOf(948822);
    }

    @Benchmark
    public String intToStringV1() {
        return Integer.toString(v);
    }

    @Benchmark
    public String intToStringV2() {
        return "" + v;
    }

    @Benchmark
    public String intToStringV3() {
        return String.valueOf(v);
    }

    @Benchmark
    public String intToStringV4() {
        return String.format("%d", v);
    }

    @Benchmark
    public String integerToStringV1() {
        return Integer.toString(vo);
    }

    @Benchmark
    public String integerToStringV2() {
        return "" + vo;
    }

    @Benchmark
    public String integerToStringV3() {
        return String.valueOf(vo);
    }

    @Benchmark
    public String integerToStringV4() {
        return String.format("%d", vo);
    }
}