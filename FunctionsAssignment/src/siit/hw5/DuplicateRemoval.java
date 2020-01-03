package siit.hw5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * the program asks the user to define the array length
 * displays the original array
 * removes the duplicates from the original array
 * and displays the array without duplicates
 *
 * @author Leonard Maican
 */


public class DuplicateRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Define array length: ");
        int arrayLength = sc.nextInt();
        int[] numbers = arrayInput(arrayLength);

        System.out.println("The numbers you typed are: " + Arrays.toString(numbers));
        numbers = removeDuplicates(numbers);
        System.out.println("The numbers you typed without duplicates: " + Arrays.toString(numbers));
    }

    /**
     * @param length the method asks the user how many integers will he type
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
     * the method removes duplicates from a given integer array
     *
     * @param nrs the int array the user typed
     * @return the array with unique elements
     */
    public static int[] removeDuplicates(int[] nrs) {
        int arrayLength = nrs.length;

        if (arrayLength < 2) {
            return nrs;
        }

        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (nrs[i] == nrs[j]) {
                    int shiftLeft = j;
                    for (int k = j + 1; k < arrayLength; k++, shiftLeft++) {
                        nrs[shiftLeft] = nrs[k];
                    }
                    arrayLength--;
                    j--;
                }
            }
        }
        int[] arrayWithoutDuplicates = new int[arrayLength];
        System.arraycopy(nrs, 0, arrayWithoutDuplicates, 0, arrayLength);
        return arrayWithoutDuplicates;
    }


}
