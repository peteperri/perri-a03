/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution31 {

    public static void main(String[] args) {
        Solution31 app = new Solution31();
        int age = app.getInput("How old are you?");
        int heartRate = app.getInput("And what is your resting heart rate?");
        System.out.print((app.makeOutput(age, heartRate)));
    }

    private int getInput(String prompt){
        //prompt is passed to getInput
        Scanner input = new Scanner(System.in);
        //user is prompted to enter data
        try {
            System.out.println(prompt);
            return input.nextInt();
        } catch(InputMismatchException ex){
            //if there's an exception for invalid input, catch it and say "invalid input"
            System.out.println("Invalid Entry: must enter an integer");
            getInput(prompt);
        }
        return 0;
    }

    private StringBuilder makeOutput(int age, int heartRate){
        StringBuilder output = new StringBuilder();
        output.append(String.format("%nResting Pulse: %d%nAge: %d%n%nIntensity | Heart Rate%n----------|------------%n", heartRate, age));
        //for loop with a StringBuilder calculates and formats the output to be returned based on the target heart rate formula
        for(int intensity = 55; intensity <= 95; intensity += 5)
        {
            output.append(String.format("      %d%% | %3.0f bpm%n", intensity, calcHeartRate(age, heartRate, intensity)));
        }
        return output;
    }

    public double calcHeartRate(int age, int heartRate, int intensity){
        return (((220.0 - age) - heartRate) * (intensity / 100.0)) + heartRate;
    }

}
