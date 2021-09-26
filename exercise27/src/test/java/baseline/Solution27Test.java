/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {
    @Test
    void validateInput() {
        Solution27 tester = new Solution27();
        assertEquals("\nThere were no errors found.", tester.validateInput("Captain", "Rex", "00000", "CT-7567"));
        assertEquals("\nThere were no errors found.", tester.validateInput("ARC Trooper", "Fives", "55555", "CT-5555"));
    }
}