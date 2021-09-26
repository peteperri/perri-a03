/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    @Test
    void calculateMonthsUntilPaidOffTest(){
        PaymentCalculator test = new PaymentCalculator(5000, 12, 100);
        assertEquals(70, test.calculateMonthsUntilPaidOff());
    }
}