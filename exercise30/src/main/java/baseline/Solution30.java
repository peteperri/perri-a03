/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

public class Solution30{
    public static void main(String[] args) {
        Solution30 app = new Solution30();

        //call makeMultiplicationTable() and assign it to a string multiplicationTable
        StringBuilder multiplicationTable = app.makeMultiplicationTable();

        //call createOutput(multiplicationTable)
        app.createOutput(multiplicationTable);
    }
    public StringBuilder makeMultiplicationTable(){
        StringBuilder table = new StringBuilder();
        //create the multiplication table using two for loops that cycle ints i and j 1 through 12, multiply i and j, then add them to the string
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                    table.append(String.format("%4d", i * j));
            }
            table.append("\n");
        }
        return table;
    }

    private void createOutput(StringBuilder output){
        //function receives a string and then prints it
        System.out.print(output);
    }
}
