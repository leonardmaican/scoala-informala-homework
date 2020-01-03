package siit.hw1;

import java.util.Scanner;

/**
 * The class asks the user to input three numbers and displays the bigger number
 *
 * @author Leonard Maican
 */
public class CalculateMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert numbers: ");
        int nr1 = sc.nextInt();
        int nr2 = sc.nextInt();
        int nr3 = sc.nextInt();
        int max = getMax(nr1, nr2);

        if (max > nr3) {
            max = getMax(nr1, nr3);

        } else {
            max = getMax(nr2, nr3);
        }
        System.out.println("The biggest of the three is: " + max);
    }

    /**
     * The method receives two integers as parameters and returns the bigger of the two numbers
     *
     * @param a UserInput
     * @param b UserInput
     * @return the bigger of the two numbers
     */
    public static int getMax(int a, int b) {

        return Math.max(a, b);
    }


}
