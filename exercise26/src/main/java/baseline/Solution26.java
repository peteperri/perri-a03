package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
import java.util.Scanner;
public class Solution26 {
    public static void main(String[] args) {

        //prompt the user for all required data
        Scanner input = new Scanner(System.in);
        System.out.println("What is your balance?: ");
        double balance = input.nextDouble();
        System.out.println("What is the APR on the card (as a percent)?");
        int aprPercent = input.nextInt();
        System.out.println("What is the monthly payment you can make?");
        double monthlyPayment = input.nextDouble();

        //create new PaymentCalculator object, passing all required data to the new instance of the object
        PaymentCalculator calc = new PaymentCalculator(balance, aprPercent, monthlyPayment);

        //call the calculateMonthsUntilPaidOff() method, assign value to a variable
        double months = calc.calculateMonthsUntilPaidOff();

        //print the result
        System.out.printf("It will take you %.0f months to pay off this card.", months);
    }
}
