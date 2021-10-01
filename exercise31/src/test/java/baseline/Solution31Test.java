package baseline;

import baseline.Solution31;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @Test
    void calcHeartRate() {
        Solution31 test = new Solution31();
        double expected = 138.15;
        double actual = test.calcHeartRate(22, 65, 55);
        assertEquals(expected, actual);
    }
}