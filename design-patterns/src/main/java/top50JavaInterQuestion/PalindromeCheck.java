package top50JavaInterQuestion;

import java.util.Scanner;

public class PalindromeCheck {
    //7.Palindrome Check
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input: ");
        String input = scanner.nextLine();
        if (checkPalindromeString(input)) {
            System.out.println("Palindrome.");
            return;
        }
        System.out.println("Not Palindrome.");
    }

    private static boolean checkPalindromeString(String input) {
        boolean result = true;
        int lenInput = input.length();
        for (int i = 0; i < lenInput / 2; i++) {
            if (input.charAt(i) != input.charAt(lenInput - i - 1)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
