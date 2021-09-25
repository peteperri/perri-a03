/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
/*
Using functions to abstract the logic away from the rest of your code makes it easier to read and easier to maintain.
Create a program that compares two strings and determines if the two strings are anagrams.
The program should prompt for both input strings and display the output as shown in the example that follows.
Implement the program using a function called isAnagram, which takes in two words as its arguments and returns true or false.
 */

package baseline;
import java.util.Scanner;

public class Solution24 {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution24 app = new Solution24();

        System.out.println("Enter two strings and I'll tell you if they are anagrams or not.");
        //get two strings from user, assign them to string variables
        String a = app.getStringFromUser();
        String b = app.getStringFromUser();

        //pass the two strings to the anagram checker function
        boolean anagram = app.isAnagram(a, b);

        //pass the anagram boolean to a function that will determine output
        app.makeOutput(anagram, a, b);

    }

    private String getStringFromUser() {
        String str = null;
        //if this is the first string:
        System.out.println("Enter a string: ");
        //if this is the second string:
        System.out.println("Enter another string: ");
        return str;
    }

    private boolean isAnagram(String a, String b) {
        /*
        check the length of the strings
        if the strings aren't the same length, return false
        else:
        sort both strings alphabetically
        compare both strings
        if the strings are equal return true
        otherwise return false
        */
        return false;
    }

    private void makeOutput(boolean anagram, String a, String b){
        //if the strings are anagrams
        System.out.printf("%s and %s are anagrams.", a, b);
        //if the strings aren't anagrams
        System.out.printf("%s and %s aren't anagrams.", a, b);
    }
}
