package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class Solution40Test {
    String[] keys = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};
    Solution40 test = new Solution40();

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

    @Test
    void searchTable(){
        String searchString = "j";
        ArrayList<HashMap<String, String>> data = new ArrayList<>();
        data.add(test.makeFirstNameMap(keys));
        data.add(test.makePositionMap(keys));
        data.add(test.makeSeparationDateMap(keys));
        ArrayList<String> searchedStrings = test.searchTable(data, keys, searchString);
        assertEquals(searchedStrings, test.searchTable(data, keys, searchString));
    }
}