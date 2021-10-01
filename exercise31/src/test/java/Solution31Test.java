import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @Test
    void calcHeartRate() {
        Solution31 test = new Solution31();
        StringBuilder actualString = test.calcHeartRate(22, 65);
        StringBuilder expectedString = new StringBuilder();
        expectedString.append("");

        assertEquals(expectedString.toString(), actualString.toString());

    }
}