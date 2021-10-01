/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Solution32 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution32 app = new Solution32();
        boolean gaming = true;
        while(gaming) {
            //call getDifficultyLevel, set return value to int variable
            int difficultyLevel = app.getDifficultyLevel();
            //set int rand to the result of calling getRandom(difficultyLevel)
            int rand = app.getRandom(difficultyLevel);
            //call playGame while passing the random number
            gaming = app.playGame(rand);
        }
    }

    private int getDifficultyLevel(){
        while(true){
            //Tell the user to enter a difficulty level, and parse it as a string
            System.out.println("Enter the difficulty level (1, 2, or 3): ");
            String difficultyLevel = input.nextLine();
            //if it has any non-numerics, or it isn't 1 2 or 3 print "invalid entry"
            if(difficultyLevel.matches(".*[a-z].*")){
                System.out.println("Invalid entry. Must enter a number.");
            }
            //else if it's 1 2 or 3 then return the difficulty level as an int
            else if(Integer.parseInt(difficultyLevel) == 1 || Integer.parseInt(difficultyLevel) == 2 || Integer.parseInt(difficultyLevel) == 3){
                System.out.println("Valid data entry. You may play.");
                return Integer.parseInt(difficultyLevel);
            }
            else{
                System.out.println("Invalid entry. Must enter a number between 1 and 3.");
            }
        }
    }

    public int getRandom(int level){
        //if difficulty level is 1, get random number between 10 and 1
        if(level == 1){
            return ThreadLocalRandom.current().nextInt(1, 10 + 1);
        }
        //else if difficulty level is 2, get random number between 100 and 1
        else if(level == 2){
            return ThreadLocalRandom.current().nextInt(1, 100 + 1);
        }
        //else you get the gist, 1000 and 1
        else{
            return ThreadLocalRandom.current().nextInt(1, 1000 + 1);
        }
    }

    private boolean playGame(int rand) {
        boolean notGuessed = true;
        int count = 0;

        System.out.println("I have my number.");
        //while loop while "not guessed"
        while(notGuessed){
            //ask for the guess, set guess equal to a string
            System.out.println("What's your guess?");
            String guessString = input.nextLine();
            //if the string isn't a number, print that it's not a number
            if(guessString.matches(".*[a-z].*")) {
                System.out.println("Too not-a-number-y.");
                count++;
            }
            //if it IS a number, set it to an integer variable and see if it's equal to the randomly generated number
            else{
                long guess = Integer.parseInt(guessString);
                if (guess == rand){
                    notGuessed = false;
                    count++;
                    System.out.printf("You guessed it! It took you %d guesses. Play again? y/n%n", count);
                    boolean playAgain = input.hasNext("y") || input.hasNext("Y") || input.hasNext("yes" )|| input.hasNext("Yes" );
                    input.nextLine();
                    return playAgain;
                }
                //if it's too small, say it's too small
                else if(guess < rand){
                    System.out.println("Too low.");
                    count++;
                }
                //if it's too big, say it's too big
                else{
                    System.out.println("Too high.");
                    count++;
                }
            }
        }
        return false;
    }
}

