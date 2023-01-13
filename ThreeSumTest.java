import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @Test
    void threeSumOK() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] expected = new int[]{0, 1, 2};
        assertArrayEquals(expected, ThreeSum.threeSum(input));
    }

}