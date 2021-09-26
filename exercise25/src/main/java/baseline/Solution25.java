/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
/*
Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:

A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.
If a password does not meet any of these rules, then report it as a password of unknown strength.

Create a passwordValidator function that takes in the password as its argument and returns a numeric value
you can evaluate to determine the password strength.
Use a single output statement.
 */

package baseline;
import java.util.Scanner;

public class Solution25 {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        Solution25 app = new Solution25();
        //call getPasswordFromUser to get the password
        String pw = app.getPasswordFromUser();
        //pass password to passwordValidator, get strengthLevel
        int strengthLevel = app.passwordValidator(pw);
        //call outputCreator, which creates output based on strengthLevel
        app.outputCreator(strengthLevel);
    }

    private String getPasswordFromUser(){
        //prompt the user for a password
        System.out.println("Enter the password: ");
        //assign the password to a variable and return it
        return input.nextLine();
    }

    public int passwordValidator(String pw){
        int strengthLevel;
        boolean containsNumber = false;
        boolean containsLetter = false;
        boolean containsSpecial = false;
        char[] charArray = pw.toCharArray();
        for(char c : charArray) {
            if (Character.isDigit(c)) {
                containsNumber = true;
            }
            else if (Character.isAlphabetic(c)) {
                containsLetter = true;
            }
            else if((!Character.isAlphabetic(c)) && !(Character.isDigit(c))){
                containsSpecial = true;
            }
        }

        //if the password only has numbers and is less than 8 characters, strengthLevel = 1
        if (containsNumber && !containsLetter && charArray.length < 8){
            strengthLevel = 1;
        }
        //else if the password only has letters and is less than 8 characters, strengthLevel = 2
        else if (containsLetter && !containsNumber && charArray.length < 8){
            strengthLevel = 2;
        }
        //else if the password has letters, numbers, and is at least 8 characters, strengthLevel = 3
        else if(containsLetter && containsNumber && !containsSpecial && charArray.length >= 8){
            strengthLevel = 3;
        }
        //else if the password has letters, numbers, and special characters and is at least 8 characters, strengthLevel = 4
        else if (containsLetter && containsNumber && containsSpecial && charArray.length >= 8){
            strengthLevel = 4;
        }
        //else strengthLevel = 0
        else {
            strengthLevel = 0;
        }
        return strengthLevel;
    }

    private void outputCreator(int strength){
        String str;
        //if strengthLevel is 1 print that the password is very weak
        if(strength == 1){
            str = "very weak";
        }
        //else if 2 print weak
        else if(strength == 2){
            str = "weak";
        }
        //else if 3 print strong
        else if(strength == 3){
            str = "strong";
        }
        //else if 4 print very strong
        else if(strength == 4){
            str = "very strong";
        }
        //else print unknown strength
        else{
            str = "of unknown strength";
        }
        System.out.printf("Password is %s.", str);
    }
}
