/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import java.util.Scanner;

public class Solution29 {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //call promptUser to validate input, then promptUser will call calcYears once input is validated
        Solution29 app = new Solution29();
        app.promptUser();
    }

    private void promptUser(){
        //when invalid is false, call calcYears
        int years;
        int r;
        boolean invalid = true;
        String data;

        //while boolean invalid is true, continue to prompt the user for new data.
        while(invalid){
            System.out.println("What is the rate of return?");
            data = input.nextLine();
            char[] array = data.toCharArray();
            for(char c : array){
                //boolean invalid is true if the data the user enters is not a number, or 0.
                if(Character.isAlphabetic(c)){
                    invalid = true;
                    System.out.println("Sorry, that's not a valid input.");
                }
                else if(Character.isDigit(c)){
                    r = Integer.parseInt(data);
                    if (r == 0){
                        System.out.println("Sorry, that's not a valid input.");
                        invalid = true;
                    }
                    else{
                        invalid = false;
                    }
                }
            }
            if (!invalid){
                r = Integer.parseInt(data);
                years = calcYears(r);
                System.out.printf("It will take %d years to double your investment.", years);
            }
        }
    }

    public int calcYears(int r){
        //calculates the number of years to double investment
        return 72 / r;
    }
}
