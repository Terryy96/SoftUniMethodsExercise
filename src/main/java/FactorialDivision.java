import java.util.Scanner;

public class FactorialDivision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long firstFactorial = calculateFactorial(firstNumber);
        long secondFactorial = calculateFactorial(secondNumber);

        double result = (double) firstFactorial / secondFactorial;

        System.out.printf("%.2f", result);
    }

    public static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
