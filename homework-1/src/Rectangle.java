import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert length: ");
        int length = sc.nextInt();
        System.out.print("Insert width: ");
        int width = sc.nextInt();
        if (length <= 0 || width <= 0) {
            System.out.println("Area and perimeter cannot be calculated!");
        } else {
            System.out.println("The rectangle perimeter is: " + perimeter(length, width));
            System.out.println("The rectangle area is: " + area(length, width));
        }


    }

    public static int perimeter(int givenLength, int givenWidth) {
        int calculatedPerimeter = 2 * givenLength + 2 * givenWidth;
        return calculatedPerimeter;

    }

    public static int area(int givenLength, int givenWidth) {
        int calculatedArea = givenLength * givenWidth;
        return calculatedArea;

    }
}
