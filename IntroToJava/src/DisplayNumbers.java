import java.util.Scanner;

public class DisplayNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert start number: ");
        int startNumber = sc.nextInt();
        System.out.print("Insert finish number: ");
        int finishNumber = sc.nextInt();
        numberDisplayer(startNumber, finishNumber);

    }

    public static void numberDisplayer(int start, int finish) {

        if (start > finish) {
            System.out.println("The starting number is bigger than the finish number.");
        } else {
            do {
                System.out.println(start);
                start++;

            }
            while (start <= finish);

        }
    }
}
