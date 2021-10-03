/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */

package baseline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution39 {
    public static void main(String[] args) {
        Solution39 app = new Solution39();
        //create an array of Strings to hold the last names, aka the keys
        String[] keys = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};

        //initialize an ArrayList of HashMaps called "data", and add each HashMap to it
        //each HashMap is filled by a respective function that receives the list of keys, since all of them use the same keys
        ArrayList<HashMap<String, String>> data = new ArrayList<>();
        data.add(app.makeFirstNameMap(keys));
        data.add(app.makePositionMap(keys));
        data.add(app.makeSeparationDateMap(keys));

        //call Arrays.sort to sort the list of keys alphabetically
        Arrays.sort(keys);

        //call the printTable function to print the output
        app.printTable(data, keys);

    }
    public HashMap makeFirstNameMap(String[] keys){
        //fill the hashmap with firstNames based on the keys
        HashMap<String, String> firstNames = new HashMap<>();
        firstNames.put(keys[0],"John");
        firstNames.put(keys[1],"Tou");
        firstNames.put(keys[2],"Michaela");
        firstNames.put(keys[3], "Jake");
        firstNames.put(keys[4], "Jacquelyn");
        firstNames.put(keys[5], "Sally");
        //return the hashmap
        return firstNames;
    }

    public HashMap makePositionMap(String[] keys){
        HashMap<String, String> positions = new HashMap<>();
        positions.put(keys[0], "Manager");
        positions.put(keys[1], "Software Engineer");
        positions.put(keys[2], "District Manager");
        positions.put(keys[3], "Programmer");
        positions.put(keys[4], "DBA");
        positions.put(keys[5], "Web Developer");
        return positions;
    }

    public HashMap makeSeparationDateMap(String[] keys){
        HashMap<String, String> separationDate = new HashMap<>();
        separationDate.put(keys[0], "2016-12-31");
        separationDate.put(keys[1], "2016-10-05");
        separationDate.put(keys[2], "2015-12-19");
        separationDate.put(keys[3], " ");
        separationDate.put(keys[4], " ");
        separationDate.put(keys[5], "2015-12-18");
        return separationDate;
    }

    private void printTable(List<HashMap<String, String>> employees, String[] keys){

        //assign each element of the array to its respective hashmap from the list
        HashMap<String, String> firstNames = employees.get(0);
        HashMap<String, String> positions = employees.get(1);
        HashMap<String, String> separationDate = employees.get(2);

        System.out.format("%-15s| %-18s| %-15s%n", "Name", "Position", "Separation Date");
        System.out.println("--------------------------------------------------------");

        //for loop that iterates through every element of the keys array and prints each hashmap for that respective key
        for (String key : keys) {
            System.out.format("%-15s| %-18s| %-15s%n", firstNames.get(key), positions.get(key), separationDate.get(key));
        }
    }
}
