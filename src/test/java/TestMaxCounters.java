import com.MaxCounters;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class TestMaxCounters {
    private static final int MAX_LENGTH = 100000;
    private MaxCounters sol = new MaxCounters();

    @Test
    public void shouldPassGivenTestCase() {
        int[] in = {3, 4, 4, 6, 1, 4, 4};
        int [] out = {3, 2, 2, 4, 2};

        assertArrayEquals(out, sol.solution(5, in));
    }

    @Test
    public void testSpeedAllMax() {
        int [] in = new int[MAX_LENGTH];
        Arrays.fill(in, MAX_LENGTH + 1);
        long start = System.currentTimeMillis();
        sol.solution(MAX_LENGTH, in);
        long end = System.currentTimeMillis();

        System.out.println("should be quick but is: " + (end - start));
        assertTrue( end - start < 1000);
    }
}
