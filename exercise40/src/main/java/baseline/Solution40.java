/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */

package baseline;

import java.util.*;

public class Solution40 {
    public static void main(String[] args) {
        Solution40 app = new Solution40();
        //create an array of Strings to hold the last names, aka the keys
        String[] keys = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};

        //initialize an ArrayList of HashMaps called "data", and add each HashMap to it
        //each HashMap is filled by a respective function that receives the list of keys, since all of them use the same keys
        ArrayList<HashMap<String, String>> data = new ArrayList<>();
        data.add(app.makeFirstNameMap(keys));
        data.add(app.makePositionMap(keys));
        data.add(app.makeSeparationDateMap(keys));

        //call the getSearchString function to prompt the user for a searchString
        String searchString = app.getSearchString();

        //call the searchTable function to search the table. this function will return an arraylist of searched strings
        ArrayList<String> searchedStrings = app.searchTable(data, keys, searchString);

        //call the printTable function to print the output
        app.printTable(data, keys, searchedStrings);

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

    private String getSearchString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the search string: ");
        return input.nextLine();
    }

    public ArrayList<String> searchTable(List<HashMap<String, String>> employees, String[] keys, String searchString){

        HashMap<String, String> firstNames = employees.get(0);

        //for loop for each key in keys
        ArrayList<String> searchedKeys = new ArrayList<>();
        for (String key : keys) {
            //compare each firstName and each key(lastNames) to the search string
            String comparisonFirstName = firstNames.get(key).toLowerCase();
            String comparisonLastName = key.toLowerCase();
            //if either contains the searchString, then add it to the list of searched keys and return the searchedKeys
            if (comparisonFirstName.contains(searchString) || comparisonLastName.contains(searchString)) {
                searchedKeys.add(key);
            }
        }
        return searchedKeys;
    }

    private void printTable(List<HashMap<String, String>> employees, String[] keys, ArrayList<String> searchedKeys){
        //assign each element of the array to its respective hashmap from the list
        HashMap<String, String> firstNames = employees.get(0);
        HashMap<String, String> positions = employees.get(1);
        HashMap<String, String> separationDate = employees.get(2);
        System.out.format("%-20s| %-18s| %-15s%n", "Name", "Position", "Separation Date");
        System.out.println("--------------------------------------------------------");
        int i = 0;
        //for loop to print out the searchedKeys and their matching data
        for(String key : searchedKeys){
            System.out.format("%-20s| %-18s| %-15s%n", firstNames.get(searchedKeys.get(i)) + " " + key, positions.get(searchedKeys.get(i)), separationDate.get(keys[i]));
            i++;
        }
    }






}
