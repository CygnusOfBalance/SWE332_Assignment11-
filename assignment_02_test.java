//Noah Hansen, Jack Schierling, Andriy Zazsypkin
//SWE332 Assignment 2 - test file

import org.junit.*;
import static org.junit.Assert.*;

public class assignment_02_test {
    public static void main(String args[]){
      org.junit.runner.JUnitCore.main("assignment_02_test");
    }

    //------------------------------------------------------------
    //happyPathTest()
    //tests to make sure that the "months" method inside of
    //assignment_02 is a happy path
    //------------------------------------------------------------
    @Test
    public void happyPathTest() {
      int months = assignment_02.months(100000, 0.08, 1000);
      assertEquals("Happy path fails", months, 166);
    }

    //------------------------------------------------------------
    //IAENegativePrincipal
    //Tests to make sure that a negative principal parameter would
    //throw an IAE
    //------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void IAENegativePrincipal() {
      assignment_02.months(-100000, 0.08, 1000);
    }

    //------------------------------------------------------------
    //IAENegativeRate()
    //Tests to make sure that a negative rate parameter would
    //throw an IAE
    //------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void IAENegativeRate() {
      assignment_02.months(100000, -0.08, 1000);
    }

    //------------------------------------------------------------
    //IAENegativeRate()
    //Tests to make sure that a negative payment parameter would
    //throw an IAE
    //------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void IAENegativePayment() {
      assignment_02.months(100000, 0.08, -1000);
    }

    //------------------------------------------------------------
    //IAEPaymentTooSmall()
    //Tests to make sure that a payment parameter that is too
    //small would throw an IAE
    //------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void IAEPaymentTooSmall() {
      assignment_02.months(100000, 0.08, 100);
    }
}
