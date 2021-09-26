/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    Solution24 tester = new Solution24();

    @Test
    void isAnagram(){
        //basic anagram test
        String str1 = "i am lord voldemort";
        String str2 = "tom marvolo riddle";

        //anagram test with capitalization
        String str3 = "I am Lord Voldemort";
        String str4 = "Tom Marvolo Riddle";

        //anagram test that should return false
        String str5 = "I am not an anagram";
        String str6 = "I so am an anagram!";

        //anagram test that should return false due to different lengths
        String str7 = "We are not the same length.";
        String str8 = "We are not.";

        assertAll(
                () -> assertTrue(tester.isAnagram(str1, str2)),
                () -> assertTrue(tester.isAnagram(str3, str4)),
                () -> assertFalse(tester.isAnagram(str5, str6)),
                () -> assertFalse(tester.isAnagram(str7, str8)));
    }
}