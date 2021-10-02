/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Solution33 {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution33 app = new Solution33();
        boolean gaming = true;
        //while boolean gaming is true, prompt the user to enter questions
        while(gaming){
           app.askQuestion();
            //get random answer from getAnswer(), print it
           System.out.println(app.getAnswer());
            //ask the user if they want to ask another question
           gaming = app.askAgain();
        }
    }

    public String getAnswer(){
        String[] answers = {"Yes", "No", "Maybe", "Ask again later"};
        //use ThreadLocalRandom.current().nextInt(1, 4 + 1); to generate a random number between 1 and 4
        int answerInt = ThreadLocalRandom.current().nextInt(1, 4 + 1);
        //series of if statements; each number 1 through 4 refers to an answer option
        if(answerInt == 1){
            return answers[0];
        }
        else if(answerInt == 2){
            return answers[1];
        }
        else if(answerInt == 3){
            return answers[2];
        }
        return answers[3];
    }
    private void askQuestion(){
        System.out.println("What's your question?");
        input.nextLine();
    }

    private boolean askAgain(){
        //if yes repeat, else end the program
        System.out.println("Ask another question?  y/n");
        boolean playAgain = input.hasNext("y") || input.hasNext("Y") || input.hasNext("yes" )|| input.hasNext("Yes" );
        input.nextLine();
        return playAgain;
    }
}
