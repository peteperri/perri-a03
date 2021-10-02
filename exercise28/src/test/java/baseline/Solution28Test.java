/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void addFiveNumbers() {
        Solution28 tester = new Solution28();
        int[] num = {1, 1, 1, 1, 1};
        assertEquals(5, tester.addFiveNumbers(num));
        int[] num2 = {5, 10, 15, 20, 25};
        assertEquals(75, tester.addFiveNumbers(num2));
    }
}