import java.util.Scanner;

public class TopNumber {
    public static boolean isSumDivisibleBy8(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum % 8 == 0;
    }

    public static boolean hasAtLeastOneOddDigit(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (isSumDivisibleBy8(i) && hasAtLeastOneOddDigit(i)) {
                System.out.println(i);
            }
        }
    }
}
