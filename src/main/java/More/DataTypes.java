package More;

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        if (type.equals("int")){
            int number = Integer.parseInt(scanner.nextLine());
            readInput(number);
        }else if (type.equals("real")){
            double number = Double.parseDouble(scanner.nextLine());
            readInput(number);
        }else if (type.equals("string")){
            String input = scanner.nextLine();
            readInput(input);
        }
    }

    public static void readInput(int number){
        int result = number*2;
        System.out.println(result);
    }
    public static void readInput(double number){
        double result = number*1.5;
        System.out.printf("%.2f", result);
    }
    public static void readInput(String input){
        System.out.println("$" + input + "$");
    }
}
