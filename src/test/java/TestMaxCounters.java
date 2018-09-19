import com.MaxCounters;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestMaxCounters {
    private MaxCounters sol = new MaxCounters();

    @Test
    public void shouldFindMinofSliceLen2() {
        int[] in = {3, 4, 4, 6, 1, 4, 4};
        int [] out = {3, 2, 2, 4, 2};

//        assertTrue(Arrays.equals(out, sol.solution(5, in)));

        assertArrayEquals(out, sol.solution(5, in));

    }

}
