package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;



class Solution35Test {
    @Test
    void pickWinner() {
        Solution35 tester = new Solution35();
        ArrayList<String> contestants = new ArrayList<>();
        contestants.add("Hunter");
        contestants.add("Wrecker");
        contestants.add("Tech");
        contestants.add("Crosshair");
        contestants.add("Echo");
        contestants.add("Omega");
        for(int i = 1; i < 10000; i++){
            assertTrue(contestants.contains(tester.pickWinner(contestants)));
        }
    }
}