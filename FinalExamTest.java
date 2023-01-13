import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinalExamTest {

    @Test
    void closestDistance() {
        int[] input = {3, 6, 12, 1};
        assertEquals(2, FinalExam.closestDistance(input));
    }

}