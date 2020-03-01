package CalculatorClass;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class tests the important methods in the Calculator class
 */
public class CalculatorTest {


    /**
     * This method tests the case in which one of the numbers is null
     */
    @Test
    public void getMaxWithOneNull() {
        Calculator c = new Calculator(null, 1, 2);

        int max = c.getMax();
        assertEquals(max, 2);

    }


    /**
     * This method tests the case in which all numbers are equal
     */
    @Test
    public void getMaxWithAllEqual() {
        Calculator c = new Calculator(1, 1, 1);

        int max = c.getMax();
        assertEquals(max, 1);

    }


    /**
     * This method test the case in which two of the three numbers are equal
     */
    @Test
    public void getMaxWithTwoEqual() {
        Calculator c = new Calculator(1, 2, 2);

        int max = c.getMax();
        assertEquals(max, 2);

    }


    /**
     * This method test the case in which all the numbers are negative
     */
    @Test
    public void getMinAllNegative() {
        Calculator c = new Calculator(-1, -2, -3);
        int min = c.getMin();
        assertEquals(min, -3);
    }


    /**
     * This method test the case in which all the numbers are equal
     */
    @Test
    public void getMinAllEqual() {
        Calculator c = new Calculator(3, 3, 3);
        int min = c.getMin();
        assertEquals(min, 3);
    }


    /**
     * This method test the case in which two of  the numbers are equal
     */
    @Test
    public void getMinTwoEqual() {
        Calculator c = new Calculator(2, 2, 3);
        int min = c.getMin();
        assertEquals(min, 2);
    }


    /**
     * This method tests what happens in case two numbers are null
     */
    @Test
    public void getSumTwoNull() {
        Calculator c = new Calculator(null, 5, null);
        int sum = c.getSum();
        assertEquals(sum, 5);

    }


    /**
     * This method tests what happens in case all numbers are null
     */
    @Test
    public void getSumAllNull() {
        Calculator c = new Calculator(null, null, null);
        int sum = c.getSum();
        assertEquals(sum, Integer.MIN_VALUE);

    }


    /**
     * This method tests what happens in case one of the numbers is null
     */
    @Test
    public void getSumOneNull() {
        Calculator c = new Calculator(2, null, 3);
        int sum = c.getSum();
        assertEquals(sum, 5);

    }


    /**
     * This test checks to see how the average is affected if a is null
     */
    @Test
    public void getAvgANull() {
        Calculator c = new Calculator(null, 2, 2);
        double avg = c.getAvg();
        assertEquals(avg, 2, 0.01);
    }


    /**
     * This test checks to see how the average is affected if b is null
     */
    @Test
    public void getAvgBNull() {
        Calculator c = new Calculator(3, null, 2);
        double avg = c.getAvg();
        assertEquals(avg, 2.5, 0.01);
    }


    /**
     * This test checks to see how the average is affected if c is null
     */
    @Test
    public void getAvgCNull() {
        Calculator c = new Calculator(3, 7, null);
        double avg = c.getAvg();
        assertEquals(avg, 5, 0.01);
    }


    /**
     * This method tests the posibility in which all numbers are null
     */
    @Test
    public void areAllPositiveAllNull() {
        Calculator c = new Calculator(null, null, null);

        assertFalse(c.areAllPositive());
    }


    /**
     * This method tests the posibility in which two numbers are null
     */
    @Test
    public void areAllPositiveTwoNull() {
        Calculator c = new Calculator(3, null, null);

        assertFalse(c.areAllPositive());
    }


    /**
     * This method tests the posibility in which all numbers are null
     */
    @Test
    public void areAllPositiveOneNull() {
        Calculator c = new Calculator(null, null, null);

        assertFalse(c.areAllPositive());
    }


    /**
     * This method tests the posibility of a being zero
     */
    @Test
    public void isAEvenAZero() {
        Calculator c = new Calculator(0, 2, 3);
        assertTrue(c.isAEven());


    }


    /**
     * This method tests the posibility of a being one
     */
    @Test
    public void isAEvenFalse() {
        Calculator c = new Calculator(1, 2, 3);
        assertFalse(c.isAEven());


    }


    /**
     * This method tests the posibility of a being null
     * In case a is null, the original method assigns a to the minimum integer number, which is -2147483648, an even number
     */
    @Test
    public void isAEvenANull() {
        Calculator c = new Calculator(null, 2, 3);
        assertTrue(c.isAEven());


    }
}