import com.MinAvgTwoSlice;
import org.junit.Test;

import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class TestMinAvgTwoSlice {
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
        int[] in = IntStream.generate(r::nextInt).limit(10000000).toArray();
        long start = System.currentTimeMillis();
        sol.solution(in);
        long time = System.currentTimeMillis() - start;
        System.out.println("in " + in.length + " values, time:" + time);
        assertTrue(time < 1000);
    }
}
