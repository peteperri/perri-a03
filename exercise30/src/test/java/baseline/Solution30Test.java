package baseline;

import baseline.Solution30;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution30Test {

    @Test
    void makeMultiplicationTable() {
        Solution30 app = new Solution30();
        StringBuilder realTable = new StringBuilder();
        StringBuilder testTable = new StringBuilder();
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                testTable.append(String.format("%4d", i * j));
            }
            testTable.append("\n");
        }
        realTable = app.makeMultiplicationTable();
        assertEquals(testTable.toString(), realTable.toString());
    }
}