import com.MinAvgTwoSlice;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class TestMinAvgTwoSlice {
    public static final int MAX_LENGTH = 10000000;
    private MinAvgTwoSlice sol = new MinAvgTwoSlice();

    @Test
    public void shouldFindMinofSliceLen2() {
        int[] in = {4, 2, 2, 5, 1, 5, 8};
        assertEquals(1, sol.solution(in));
    }

    @Test
    public void shouldFindMinofSliceLen3() {
        int[] in = {4, 2, -10, -4, -8, 8};
        assertEquals(2, sol.solution(in));
    }



    @Test
    public void timingTest() {
        Random r = new Random();
        int[] in = IntStream.generate(r::nextInt).limit(MAX_LENGTH).toArray();
        long start = System.currentTimeMillis();
        sol.solution(in);
        long time = System.currentTimeMillis() - start;
        System.out.println("random timing in " + in.length + " values, time:" + time);
        assertTrue(time < 500);
    }

    @Test
    public void timingTestExtremeSmall() {
        Random r = new Random();
        int[] in = IntStream.generate(r::nextInt)
            .limit(MAX_LENGTH)
            .map(v-> v > Integer.MAX_VALUE /3 ? 1 : (v < Integer.MIN_VALUE /3 ? -1 : 0))
            .toArray();

        long start = System.currentTimeMillis();
        sol.solution(in);
        long time = System.currentTimeMillis() - start;
        System.out.println("extreme small in " + in.length + " values, time:" + time);
        assertTrue(time < 500);
    }

    @Test
    public void timingTestExtremeBoolean() {
        Random r = new Random();
        int[] in = IntStream.generate(r::nextInt)
            .limit(MAX_LENGTH)
            .map(v-> v > 0 ? 1 : -1)
            .toArray();

        long start = System.currentTimeMillis();
        sol.solution(in);
        long time = System.currentTimeMillis() - start;
        System.out.println("extreme small in " + in.length + " values, time:" + time);
        assertTrue(time < 500);
    }

    @Test
    public void timingTestExtremeMax() {
        Random r = new Random();
        int[] in = IntStream.generate(r::nextInt)
            .limit(MAX_LENGTH)
            .map(v-> v > 0 ? Integer.MAX_VALUE  : Integer.MIN_VALUE )
            .toArray();

        long start = System.currentTimeMillis();
        sol.solution(in);
        long time = System.currentTimeMillis() - start;
        System.out.println("extreme large in " + in.length + " values, time:" + time);
        assertTrue(time < 500);
    }

    @Test
    public void timingTestAllMax() {
        int[] in = new int[MAX_LENGTH];
        Arrays.fill(in, Integer.MAX_VALUE);

        long start = System.currentTimeMillis();
        sol.solution(in);
        long time = System.currentTimeMillis() - start;
        System.out.println("all max in " + in.length + " values, time:" + time);
        assertTrue(time < 500);
    }

    @Test
    public void timingTestAllMin() {
        int[] in = new int[MAX_LENGTH];
        Arrays.fill(in, Integer.MIN_VALUE);

        long start = System.currentTimeMillis();
        sol.solution(in);
        long time = System.currentTimeMillis() - start;
        System.out.println("all min in " + in.length + " values, time:" + time);
        assertTrue(time < 500);
    }
}
