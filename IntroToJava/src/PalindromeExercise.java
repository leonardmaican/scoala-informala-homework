import java.util.Scanner;


public class PalindromeExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert number: ");
        int number = sc.nextInt();
        if (palindromeChecker(number)) {

            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }

    }

    public static boolean palindromeChecker(int nr) {
        int copy = nr;
        int reverse = 0;

        while (nr > 0) {

            int remainder = nr % 10;
            reverse = reverse * 10 + remainder;
            nr /= 10;
        }
        return reverse == copy;

    }
}
