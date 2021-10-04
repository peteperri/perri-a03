/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;
import java.util.Scanner;

public class Solution38 {
    public static void main(String[] args) {
        //call getInput
        //call convertStringToIntArray on the input from the user
        //call filterNumbers on the input from the user
        //print the filtered number list
    }
    public int[] filterNumbers(int[] num){
        //loop through the array of numbers
        //if the number at the current index % 2 = 0, add it to the array of even numbers
        //return the array of even numbers
    }
    public int[] convertStringToIntArray(String userIn){
        //convert the String entered by the user in getInput to an array of integers
    }
    private String getInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextLine();
    }

}
