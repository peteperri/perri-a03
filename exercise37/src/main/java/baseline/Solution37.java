/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Solution37 {
    public static void main(String[] args) {
        Solution37 app = new Solution37();
        //prompt the user for the necessary data
        int minLength = app.promptUser("What is the minimum length?");
        int specialChars = app.promptUser("How many special characters?");
        int numberCount = app.promptUser("How many numbers?");
        //call generate password to generate password
        String password = app.generatePassword(minLength, specialChars, numberCount);
        //print the password
        System.out.println("Your password is " + password);
    }
    public String generatePassword(int minLength, int specialCount, int numberCount){
        //generate a password based on the user's input

        //strings to contain the elements of a password
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special = "!@#$%^&*()_+{}[]<>?,.~";
        String digits = "1234567890";

        //these variables exist to make sure there are more letters than numbers and special characters combined
        int requiredLetterCount = (numberCount + specialCount);
        minLength = minLength + requiredLetterCount + specialCount + numberCount;
        int trueLength = ThreadLocalRandom.current().nextInt(minLength, minLength + 10);
        int actualLetterCount = 0;

        //password that will be added to
        StringBuilder password = new StringBuilder();

        //while loop adds as many letters to the string as are required
        while(actualLetterCount < trueLength) {
            int letterIndex = ThreadLocalRandom.current().nextInt(0, alphabet.length());
            password.append(alphabet.charAt(letterIndex));
            actualLetterCount++;
        }

        //for loops add numbers and special characters based on how many are specified by the user
        for (int i = 0; i < specialCount; i++) {
            int specialIndex = ThreadLocalRandom.current().nextInt(0, special.length());
            int randomPasswordIndex = ThreadLocalRandom.current().nextInt(0, trueLength);
            password.insert(randomPasswordIndex, special.charAt(specialIndex));
        }

        for (int i = 0; i < numberCount; i++) {
            int numberIndex = ThreadLocalRandom.current().nextInt(0, digits.length());
            int randomPasswordIndex = ThreadLocalRandom.current().nextInt(0, trueLength);
            password.insert(randomPasswordIndex, digits.charAt(numberIndex));
        }

        return password.toString();
    }
    private int promptUser(String prompt){
        //returns an int based on the prompt
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        try{
            return input.nextInt();
        }
        catch(InputMismatchException ex){
            System.out.println("Not an integer");
            promptUser(prompt);
        }
        return 0;
    }

}
