/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

public class PaymentCalculator {

    double balance;
    int aprPercent;
    double monthlyPayment;

    public PaymentCalculator(double balance, int aprPercent, double monthlyPayment){
        //constructor
        this.balance = balance;
        this.aprPercent = aprPercent;
        this.monthlyPayment = monthlyPayment;
    }
    public int calculateMonthsUntilPaidOff(){
        //use balance, aprPercent, and monthlyPayment to calculate the amount of months left, and return it
        double apr = aprPercent/100.0;
        double months = (-(1.0/30.0) * (Math.log(1 + ((balance/monthlyPayment) * (1 - (Math.pow((1 + apr/365), 30))))))) / (Math.log(1 + apr/365));
        months = Math.ceil(months);
        return (int) months;
    }
}
