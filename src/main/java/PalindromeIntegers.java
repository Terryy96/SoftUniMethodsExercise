import java.util.Scanner;

public class PalindromeIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("END")){
            if (palindromeRead(command)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
            command= scanner.nextLine();
        }
    }

    public static boolean palindromeRead(String text){
        String revered = "";
        for (int i = text.length() - 1; i >=0 ; i--) {
            char digit = text.charAt(i);
            revered+=digit;
        }
        return text.equals(revered);
    }
}
