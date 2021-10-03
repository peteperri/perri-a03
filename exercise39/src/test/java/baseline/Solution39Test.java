/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class Solution39Test {
    Solution39 test = new Solution39();
    String[] keys = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};

    @Test
    void makeFirstNameMap() {
        HashMap<String, String> firstNames = new HashMap<>();
        firstNames.put(keys[0],"John");
        firstNames.put(keys[1],"Tou");
        firstNames.put(keys[2],"Michaela");
        firstNames.put(keys[3], "Jake");
        firstNames.put(keys[4], "Jacquelyn");
        firstNames.put(keys[5], "Sally");
        HashMap<String, String> testMap = new HashMap<>();
        testMap = test.makeFirstNameMap(keys);
        assertEquals(firstNames, testMap);

    }

    @Test
    void makePositionMap() {
        HashMap<String, String> positions = new HashMap<>();
        positions.put(keys[0], "Manager");
        positions.put(keys[1], "Software Engineer");
        positions.put(keys[2], "District Manager");
        positions.put(keys[3], "Programmer");
        positions.put(keys[4], "DBA");
        positions.put(keys[5], "Web Developer");
        HashMap<String, String> testMap = new HashMap<>();
        testMap = test.makePositionMap(keys);
        assertEquals(positions, testMap);
    }

    @Test
    void makeSeparationDateMap() {
        HashMap<String, String> separationDate = new HashMap<>();
        separationDate.put(keys[0], "2016-12-31");
        separationDate.put(keys[1], "2016-10-05");
        separationDate.put(keys[2], "2015-12-19");
        separationDate.put(keys[3], " ");
        separationDate.put(keys[4], " ");
        separationDate.put(keys[5], "2015-12-18");
        HashMap<String, String> testMap = new HashMap<>();
        testMap = test.makeSeparationDateMap(keys);
        assertEquals(separationDate, testMap);
    }
}