/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */
package baseline;
import java.util.Scanner;

public class Solution28 {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Solution28 app = new Solution28();

        //declare int array num with a size of 5
        int[] num;
        num = new int[5];

        //set sum equal to a call to addFiveNumbers(num)
        int sum = app.getFiveNumbers(num);

        //send sum to the makeOutput function
        app.makeOutput(sum);
    }

    public int getFiveNumbers(int[] num){
        //for i = 0, i < 5, i++, ask the user for a number, then add that number to num array
        for(int i = 0; i < 5; i++){
            System.out.println("Enter an integer (whole number): ");
            num[i] = input.nextInt();
        }
       return addFiveNumbers(num);
    }
    public int addFiveNumbers(int[] num){
        //add all numbers in num array
        int sum = 0;
        for(int i = 0; i < 5; i++){
            sum = sum + num[i];
        }
        return sum;
    }

    private void makeOutput(int sum){
        System.out.println("The total is " + sum);
    }
}
