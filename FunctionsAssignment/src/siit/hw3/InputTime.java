package siit.hw3;

import java.util.Scanner;

/**
 * The program asks the user to input the current time
 * checks whether the user input can be considered a valid time
 * sets the time
 *
 * @author Leonard Maican
 */


public class InputTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What time is it? ");
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        if (timeValidator(hours, minutes)) {
            System.out.println("The time is " + hours + ":" + minutes + " now");
        } else {
            System.out.println("Incorrect time!");
        }
    }

    /**
     * The method checks whether the integers received as parameters can be considered as hours and minutes
     *
     * @param hrs the user defined hours
     * @param min the user defined minutes
     * @return whether the integers received as parameters can be considered as hours and minutes
     */
    public static boolean timeValidator(int hrs, int min) {
        return hrs < 23 && min < 60 && hrs > -1 && min > -1;

    }
}
