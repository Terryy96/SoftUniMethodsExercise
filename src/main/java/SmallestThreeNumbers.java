import java.util.Arrays;
import java.util.Scanner;

public class SmallestThreeNumbers {

    public static void main(String[] args) {
        findSmallestOfThreeNum();
    }

    public static void findSmallestOfThreeNum(){
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int smallest = Math.min(Math.min(first, second), third);
        System.out.println(smallest);
    }
}
