/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Solution35 {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Solution35 app = new Solution35();
        //call getUserInput, assign value to new ArrayList
        ArrayList<String> names;
        names = app.getUserInput();
        //call pickWinner, assign value to String winner
        String winner = app.pickWinner(names);
        //pass winner to createOutput function
        app.createOutput(winner);
    }
    private ArrayList<String> getUserInput(){
        boolean blank = false;
        ArrayList<String> names = new ArrayList<>();
        //asks user for a name until they leave an entry blank
        while(!blank){
            System.out.println("Enter a name: ");
            String temp = input.nextLine();
            if(!(temp.equals(""))){
                //adds each name to the arrayList
                names.add(temp);
            }
            else{
                blank = true;
            }
        }
        //return the arrayList
        return names;
    }
    public String pickWinner(ArrayList<String> contestants){
        //generate random integer between 1 and ArrayList size
        int winInt = ThreadLocalRandom.current().nextInt(1, contestants.size());
        //return the ArrayList entry at the randomly generated index
        return contestants.get(winInt);
    }

    private void createOutput(String winner){
        System.out.println("The winner is " + winner + "!");
    }
}
