/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import java.util.Scanner;

public class Solution27 {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Solution27 app = new Solution27();
        //call promptUser to get necessary data from user
        String firstName = app.promptUser("Enter the first name: ");
        String lastName = app.promptUser("Enter the last name: ");
        String zipCode = app.promptUser("Enter the zip code: ");
        String empID = app.promptUser("Enter the Employee ID: ");

        //pass data to validateInput() function to be validated. assign return value of validateInput() to a string
        String result = app.validateInput(firstName, lastName, zipCode, empID);

        //print the string to tell the user if there were any issues with their entries or not
        System.out.println(result);
    }
    private String promptUser(String prompt){
        System.out.println(prompt);
        return input.nextLine();
    }
    public String validateInput(String firstName, String lastName, String zipCode, String empID){

        //create a series of boolean values for if firstName, lastName, etc. are valid
        //call validateFirstName, validateLastName, etc. and assign the return values to said booleans
        boolean firstNamePresent = isFirstNamePresent(firstName);
        boolean lastNamePresent = isLastNamePresent(lastName);
        boolean firstNameValid = validateFirstName(firstName);
        boolean lastNameValid = validateLastName(lastName);
        boolean zipCodeValid = validateZipCode(zipCode);
        boolean empIDValid = validateEmpID(empID);

        //utilizing these booleans, construct a string that tells the user what issues (if any) are present in their entry
        String result = "";
        if(!firstNamePresent){
            result = result + "\nThe first name must be filled in.";
        }
        if(!firstNameValid){
            result = result + "\nThe first name must be at least 2 characters long.";
        }
        if(!lastNamePresent){
            result = result + "\nThe last name must be filled in.";
        }
        if(!lastNameValid){
            result = result + "\nThe last name must be at least 2 characters long.";
        }
        if(!zipCodeValid){
            result = result + "\nThe zipcode must be a 5 digit number.";
        }
        if(!empIDValid){
            result = result + "\nThe employee ID must be in the format of AA-1234.";
        }
        //if there are no issues, return "no issues"
        if(firstNameValid && lastNameValid && zipCodeValid && empIDValid){
            result = "\nThere were no errors found.";
        }
        return result;
    }

    private boolean isFirstNamePresent(String firstname){
        return !firstname.isEmpty();
    }

    private boolean isLastNamePresent(String lastname){
        return !lastname.isEmpty();
    }

    private boolean validateFirstName(String firstname){
        return firstname.length() > 2;
    }

    private boolean validateLastName(String lastName){
        return lastName.length() > 2;
    }

    private boolean validateZipCode(String zipCode){
       char [] charArray = zipCode.toCharArray();
        for(char c : charArray) {
            if(Character.isAlphabetic(c)){
                return false;
            }
        }
        return zipCode.length() == 5;
    }

    private boolean validateEmpID(String empID){
        if (empID.length() != 7) {
            return false;
        }
        else {
            return empID.substring(0, 2).matches("[a-zA-Z]+") && empID.charAt(2) == '-' && empID.substring(3, 7).matches("[0-9]+");
        }

    }
}
