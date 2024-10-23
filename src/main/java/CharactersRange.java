import java.util.Scanner;

public class CharactersRange {

    public static void main(String[] args) {
    charactersInRange();
    }

    public static void charactersInRange(){
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        if (first < second) {
            for (char ch = (char) (first + 1); ch < second; ch++) {
                System.out.print(ch + " ");
            }
        } else {
            for (char ch = (char) (second + 1); ch < first; ch++) {
                System.out.print(ch + " ");
            }
        }
    }
}
