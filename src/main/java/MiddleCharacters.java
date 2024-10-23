import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        printMiddleCharacter(input);
    }
    public static void printMiddleCharacter(String input) {
        int length = input.length();
        int middleIndex = length / 2;

        if (length % 2 != 0) {
            System.out.println(input.charAt(middleIndex));
        }
        else {
            System.out.println(input.charAt(middleIndex - 1) + "" + input.charAt(middleIndex));
        }
    }

}
