/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {

    @Test
    void getAnswer() {
        Solution33 test = new Solution33();
        String actual = test.getAnswer();
        boolean working = actual.equals("Yes") || actual.equals("No") || actual.equals("Maybe") || actual.equals("Ask Again Later");
        assertTrue(working);
    }
}