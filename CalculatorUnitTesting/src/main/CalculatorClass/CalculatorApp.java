package CalculatorClass;

/**
 * This is the calculator app, it instantiates a calculator object, uses the important methods and prints results
 */

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int max = c.getMax();
        int min = c.getMin();
        int sum = c.getSum();
        double average = c.getAvg();


        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        System.out.println(average);
        System.out.println(c.areAllPositive());
        System.out.println(c.isAEven());
    }
}
