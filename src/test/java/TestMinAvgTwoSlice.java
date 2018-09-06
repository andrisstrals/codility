import com.MinAvgTwoSlice;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMinAvgTwoSlice {
    private MinAvgTwoSlice sol = new MinAvgTwoSlice();

    @Test
    public void shouldFindMinofSliceLen2() {
        int[] in = {4, 2, 2, 5, 1, 5, 8};
        assertEquals(1, sol.solution(in) );
    }

    @Test
    public void shouldFindMinofSliceLen3() {
        int[] in = {4, 2, -10, -4, -8, 8};
        assertEquals(2, sol.solution(in) );
    }
}
