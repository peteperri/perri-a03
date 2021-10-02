/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;
import java.util.ArrayList;
import java.util.Scanner;


public class Solution34 {
    public static void main(String[] args) {
        boolean firingEmployees = true;
        Solution34 app = new Solution34();

        //create the ArrayList of employees by calling makeList
        ArrayList<String> employees = new ArrayList<>();
        employees = app.makeList();

        //while firingEmployees:
        while(firingEmployees){
            //print the list by calling printEmployeeList
            app.printEmployeeList(employees);

            //get input from the user by calling getInput(1)
            String input = app.getInput();

            //pass the arraylist and the input to fireEmployees, which will remove an employee and return the list
            app.fireEmployee(employees, input);
            app.printEmployeeList(employees);

            //ask the user if they would like to fire more employees by calling getInput(2)
            boolean firingAgain = app.fireAgain();

            if (!firingAgain){
                //if no update firingEmployees to false
                firingEmployees = false;

                System.out.println("Goodbye");
            }
        }
    }

    public ArrayList makeList(){
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        return employees;
    }

    private String getInput(){
        Scanner input = new Scanner(System.in);
        //prompt the user for input
        System.out.println("Enter the name of the Employee to remove: ");
        return input.nextLine();
    }

    public ArrayList fireEmployee(ArrayList employees, String fired){
        //this function will receive an arraylist of employees, then remove the fired employee from the list
        if (employees.contains(fired)){
            for(int i = 0; i < employees.size(); i++){
                if(fired.equals(employees.get(i))){
                    employees.remove(i);
                }
            }
            return employees;
        }
        else{
            System.out.println("Name entered not in list");
            return employees;
        }
    }

    private void printEmployeeList(ArrayList employees){
        System.out.println(employees);
    }

    private boolean fireAgain(){
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to remove another employee? y/n");
        boolean fireAgain = input.hasNext("y") || input.hasNext("yes") || input.hasNext("Yes" )|| input.hasNext("Y" );
        input.nextLine();
        return fireAgain;
    }
}
