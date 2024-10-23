import java.util.Scanner;

public class VowelsCount {

    public static void main(String[] args) {
    vowelsCount();
    }

    public static void vowelsCount() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            switch (symbol) {
                case 'a':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    sum += 1;
                    break;
            }
        }
        System.out.println(sum);

    }
}
