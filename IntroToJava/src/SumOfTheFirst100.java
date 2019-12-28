public class SumOfTheFirst100 {
    public static void main(String[] args) {
        sumCalculator();
    }

    public static void sumCalculator() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Suma primelor 100 numere este: " + sum);


    }
}
