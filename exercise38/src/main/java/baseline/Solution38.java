/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;
import java.util.Arrays;
import java.util.Scanner;

public class Solution38 {
    public static void main(String[] args) {
        Solution38 app = new Solution38();

        //call getInput
        String userIn = app.getInput("Enter a list of numbers, separated by spaces: ");

        //call convertStringToIntArray on the input from the user
        int[] unfilteredArray = app.convertStringToIntArray(userIn);
        //call filterNumbers on the input from the user
        int[] filteredArray = app.filterNumbers(unfilteredArray);

        //print the filtered number list
        System.out.println("The even numbers are " + Arrays.toString(filteredArray));
    }
    public int[] filterNumbers(int[] inputArray){
            int[] evenArray = new int[inputArray.length];
            int index = 0;
            //loop through the array of numbers
            for (int num : inputArray) {
                //if the number at the current index % 2 = 0, add it to the array of even numbers
                if (num % 2 == 0) {
                    evenArray[index] = num;
                    index++;
                }
            }
            int[] outputArray = new int[index];
            for (int i = 0; i < outputArray.length; i++) {
                outputArray[i] = evenArray[i];
            }
            //return the array of even numbers
            return outputArray;
    }
    public int[] convertStringToIntArray(String userIn){
        //convert the String entered by the user in getInput to an array of integers
            String[] stringArray = userIn.split(" ");
            int[] intArray = new int[stringArray.length];
            try{
                for(int i = 0; i < stringArray.length ; i++){
                    intArray[i] = Integer.parseInt(stringArray[i]);
                }
                return intArray;
            }catch (NumberFormatException ex){
                System.out.println("Error: Numbers entered improperly");
            }
        return intArray;
    }
    private String getInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextLine();
    }

}
