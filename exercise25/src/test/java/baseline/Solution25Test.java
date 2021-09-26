/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void passwordValidator() {
        Solution25 tester = new Solution25();
        assertEquals(1, tester.passwordValidator("1234"));
        assertEquals(2, tester.passwordValidator("abcde"));
        assertEquals(3, tester.passwordValidator("abcde12345"));
        assertEquals(4, tester.passwordValidator("abcde452!@%*&$(#"));
        assertEquals(0, tester.passwordValidator("12ab"));
    }
}