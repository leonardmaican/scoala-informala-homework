package CalculatorClass;

/**
 * This class instantiates a calculator object with three integer fields
 * The user can use this class to find the biggest and smallest of three numbers,
 * but also calculate the sum and average of the numbers
 * and find out if one or all numbers are positive
 *
 * @author Leonard Maican
 */
public class Calculator {
    private Integer a, b, c;

    public Calculator() {
        a = 1;
        b = 2;
        c = 3;
    }

    public Calculator(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    /**
     * This method is used to get the biggest of three numbers
     *
     * @return the biggest given number
     */
    public Integer getMax() {
        if (a == null) {
            a = Integer.MIN_VALUE;
        }
        if (b == null) {
            b = Integer.MIN_VALUE;
        }
        if (c == null) {
            c = Integer.MIN_VALUE;
        }


        return Math.max(a, Math.max(b, c));
    }

    /**
     * This method returns the smallest number of the thre
     *
     * @return the smallest given number
     */
    public Integer getMin() {
        if (a == null) {
            a = Integer.MIN_VALUE;
        }
        if (b == null) {
            b = Integer.MIN_VALUE;
        }
        if (c == null) {
            c = Integer.MIN_VALUE;
        }
        return Math.min(a, Math.min(b, c));
    }

    /**
     * This method calculates the sum of the three numbers
     *
     * @return the sum of the given numbers
     */
    public Integer getSum() {

        if (a == null) {
            a = Integer.MIN_VALUE;

        }
        if (b == null) {
            b = Integer.MIN_VALUE;

        }
        if (c == null) {
            c = Integer.MIN_VALUE;

        }
        return a + b + c;
    }

    /**
     * This method is used to calculate the average of the three numbers.
     * If one of the numbers is null, then the method adds the other two numbers and divides it by two
     *
     * @return the average of the numbers
     */
    public Double getAvg() {
        double avg;


        if (a == null) {
            avg = ((double) getB() + (double) getC()) / 2;
        } else if (b == null) {
            avg = ((double) getA() + (double) getC()) / 2;
        } else if (c == null) {
            avg = ((double) getA() + (double) getB()) / 2;
        } else {
            avg = ((double) getA() + (double) getB() + (double) getC()) / 3;
        }

        return avg;
    }

    /**
     * This method checks if all three numbers are positive
     *
     * @return true, if a, b and c are positive
     * false, otherwise
     */
    public boolean areAllPositive() {
        if (a == null) {
            a = Integer.MIN_VALUE;

        }
        if (b == null) {
            b = Integer.MIN_VALUE;

        }
        if (c == null) {
            c = Integer.MIN_VALUE;

        }
        return a > 0 && b > 0 && c > 0;
    }

    /**
     * This method checks if the first number is even
     *
     * @return true, if a is even
     * false, otherwise
     */

    public boolean isAEven() {
        if (a == null) {
            a = Integer.MIN_VALUE;

        }
        return a % 2 == 0;

    }

}
