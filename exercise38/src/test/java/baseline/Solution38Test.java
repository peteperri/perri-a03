/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {
    Solution38 test = new Solution38();
    @Test
    void filterNumbers() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] output = test.filterNumbers(input);
        int[] expected = {2, 4, 6};
        assertArrayEquals(expected, output);

    }

    @Test
    void convertStringToIntArray() {
        String input = "1 2 3 4 5 6";
        int[] output = test.convertStringToIntArray(input);
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, output);
    }
}