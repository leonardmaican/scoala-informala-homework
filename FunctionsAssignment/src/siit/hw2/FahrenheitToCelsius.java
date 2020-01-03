package siit.hw2;

import java.util.Scanner;

/**
 * The class asks the user to input their temperature in fahrenheit and returns it in celsius.
 * If the temperature is higher than 37 it generates a ill warning
 *
 * @author Leonard Maican
 */

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert temperature: ");
        double givenTemp = sc.nextDouble();
        System.out.println("Your body temperature in Celsius is: " + tempConverter(givenTemp));
        if (tempConverter(givenTemp) > 37) {
            System.out.println("You are ill!");
        }

    }

    /**
     * The method converts the temperature in fahrenheit to celsius
     *
     * @param ftemp the given temperature in fahrenheit
     * @return the temperature in celsius
     */
    public static double tempConverter(double ftemp) {

        return (ftemp - 32) / 1.8;
    }

}
