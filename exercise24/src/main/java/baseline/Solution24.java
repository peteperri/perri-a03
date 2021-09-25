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
import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution24 app = new Solution24();

        System.out.println("Enter two strings and I'll tell you if they are anagrams or not.");

        //get two strings from user, assign them to string variables
        String a = app.getStringFromUser(1);
        String b = app.getStringFromUser(2);

        //pass the two strings to the anagram checker function
        boolean anagram = app.isAnagram(a, b);

        //pass the anagram boolean to a function that will determine output
        app.makeOutput(anagram, a, b);
    }

    private String getStringFromUser(int num) {
        String str;
        if(num == 2) {
            //if this is the second string:
            System.out.println("Enter another string: ");
        }
        else {
            //if this is the first (or any other) string:
            System.out.println("Enter a string: ");
        }
        str = input.nextLine();
        return str;
    }

    public boolean isAnagram(String a, String b) {
        char[] str1 = prepString(a);
        char[] str2 = prepString(b);

        //compare both strings
        for (int i = 0; i < str1.length; i++) {
            //if any characters are not equal, break from loop and return false
            if (str1[i] != str2[i]) {
                return false;
            }
        }
        //otherwise, return true
        return true;
    }

    private char[] prepString(String str) {
        //remove spaces from the string, make the string fully lowercase, and convert to char array
        char[] charArray = str.replaceAll("\\s","").toLowerCase().toCharArray();

        //sort char array alphabetically
        Arrays.sort(charArray);

        return charArray;
    }

    private void makeOutput(boolean anagram, String a, String b){
        if(anagram){
            System.out.printf("%s and %s are anagrams.", a, b);
        }
        else{
            //if the strings aren't anagrams
            System.out.printf("%s and %s aren't anagrams.", a, b);
        }
    }
}
