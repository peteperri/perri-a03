/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {

    @Test
    void getRandom() {
        Solution32 app = new Solution32();
        int myNum = app.getRandom(1);
        assertTrue(myNum < 10 && myNum > 1);
        myNum = app.getRandom(2);
        assertTrue(myNum < 100 && myNum > 1);
        myNum = app.getRandom(3);
        assertTrue(myNum < 1000 && myNum > 1);
    }
}