import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        isPasswordValid(pass);
    }


    public static void isPasswordValid (String password){
        boolean isValid = true;

        if (password.length() <6 || password.length() >10) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }

        if (!isOnlyLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
            isValid = false;
        }

        // Rule 3: Password must have at least 2 digits
        if (countDigits(password) < 2) {
            System.out.println("Password must have at least 2 digits");
            isValid = false;
        }

        // If all rules are fulfilled, print success message
        if (isValid) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isOnlyLettersAndDigits(String input) {
        for (char ch : input.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    // Helper method to count the digits in the string
    public static int countDigits(String input) {
        int count = 0;
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        return count;
    }
}
