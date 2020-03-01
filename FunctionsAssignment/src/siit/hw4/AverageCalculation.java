package siit.hw4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * the program asks the user to input the array length
 * the user is asked to type the numbers
 * the program returns the average of the numbers typed
 *
 * @author Leonard Maican
 */


public class AverageCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Define array length: ");
        int arrayLength = sc.nextInt();
        int[] numbers = arrayInput(arrayLength);

        System.out.println("The numbers you typed are: " + Arrays.toString(numbers));
        System.out.println("The average of the numbers typed is: " + averageCalculator(numbers));
    }

    /**
     * @param length the method asks for the integer array length
     * @return the array with the numbers typed by the user
     */
    public static int[] arrayInput(int length) {
        Scanner sc = new Scanner(System.in);
        int[] nrs = new int[length];
        System.out.print("Insert numbers: ");
        for (int index = 0; index < nrs.length; index++) {
            nrs[index] = sc.nextInt();

        }
        return nrs;
    }

    /**
     * @param numbers the method asks for a integer array
     * @return the average of all the numbers in the array
     */
    public static double averageCalculator(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;

        }
        return sum / (double) numbers.length;


    }


}
