/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Solution34 {
    public static void main(String[] args) {
        //while firingEmployees:
        //create the ArrayList of employees by calling makeList
        //print the list by calling printEmployees
        //get input from the user by calling getInput(1)
        //pass the arraylist and the input to fireEmployees, which will remove an employee and return the list
        //ask the user if they would like to fire more employees by calling getInput(2)
        //if no update firingEmployees to false
    }
    public ArrayList makeList(){
        ArrayList<String> employees = new ArrayList<>();
        //add the employees to the list
        return employees;
    }
    private String getInput(int decision){
        Scanner input = new Scanner(System.in);
        //prompt the user for input
        return "";

    }
    public ArrayList fireEmployee(ArrayList employees, String fired){
        //this function will receive an arraylist of employees, then remove the fired employee from the list
        return employees;
    }
    private void printEmployeeList(ArrayList employees){
        System.out.println(employees);
    }
}
