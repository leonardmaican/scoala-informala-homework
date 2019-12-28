import java.util.Scanner;

public class BiggestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert numbers: ");
        int nr1 = sc.nextInt();
        int nr2 = sc.nextInt();
        int nr3 = sc.nextInt();
        numberChecker(nr1, nr2, nr3);

    }

    public static void numberChecker(int first, int second, int third) {
        if (first > second && first > third)
            System.out.println("First number is the biggest.");
        else if (second > first && second > third)
            System.out.println("Second number is the biggest.");
        else if (third > first && third > second)
            System.out.println("Third number is the biggest.");
        else
            System.out.println("The numbers are not distinct.");


    }
}
