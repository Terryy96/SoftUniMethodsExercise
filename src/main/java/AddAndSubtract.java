import java.util.Scanner;

public class AddAndSubtract {

    public static void main(String[] args) {
  subtract();
    }

    public static int sum (int first, int second){
        int sum = first+second;
        return sum;
    }

    public static void subtract  (){
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int resultFromSum = sum(first, second);

        int result = resultFromSum - third;
        System.out.println(result);
    }
}
