import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */
public class Solution28 {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Solution28 app = new Solution28();
        int num = 0;
        app.addFiveNumbers(num);
    }
    public int addFiveNumbers(int num){
       for(int i = 0; i < 5; i++){
           System.out.println("Enter a number: ");
           num = num + input.nextInt();
        }
       return num;
    }
    public void makeOutput(int num){
        System.out.println("The total is " + num);
    }
}
