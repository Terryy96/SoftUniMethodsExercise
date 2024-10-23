package More;

import java.util.Scanner;

public class MultiplicationSign {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        checkIfMultiplicationisNegative(n1, n2, n3);

    }

    public static void checkIfMultiplicationisNegative(int n1, int n2, int n3){
        if (n1==0 || n2==0 || n3==0){
            System.out.println("zero");
            return;
        }
        int negativeCount = 0;
        if (n1<0){
            negativeCount++;
        }
        if (n2<0){
            negativeCount++;
        }
        if (n3<0){
            negativeCount++;
        }

        if (negativeCount % 2 != 0){
            System.out.println("negative");
        }else {
            System.out.println("positive");
        }
    }
}
