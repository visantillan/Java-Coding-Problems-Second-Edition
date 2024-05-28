package modern.challenge;

import com.google.common.math.DoubleMath;
import org.openjdk.jmh.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.AverageTime)
@Fork(value = 1, warmups = 0)
@Measurement(iterations = 10, time = 1)
@State(Scope.Benchmark)
public class Main {

    @Param({"23.11", "23"})
    private double v;

    public static void main(String[] args) throws IOException {
        org.openjdk.jmh.Main.main(args);
    }

    @Benchmark
    public boolean isDoubleIntegerV1() {

        return v == (int) v;
    }

    @Benchmark
    public boolean isDoubleIntegerV2() {

        return v % 1 == 0;
    }

    @Benchmark
    public boolean isDoubleIntegerV3() {

        return ((Math.floor(v) == v) && Double.isFinite(v));
    }

    @Benchmark
    public boolean isDoubleIntegerV4() {

        return (Math.floor(v) == Math.ceil(v) && Double.isFinite(v));
    }

    @Benchmark
    public boolean isDoubleIntegerV5() {

        return ((Math.rint(v) == v) && Double.isFinite(v));
    }

    @Benchmark
    public boolean isDoubleIntegerV6() {

        return DoubleMath.isMathematicalInteger(v);
    }
}