/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {
    Solution29 tester = new Solution29();
    @Test
    void calcYears(){
        assertEquals(18, tester.calcYears(4));
        assertEquals(3, tester.calcYears(20));
    }

}