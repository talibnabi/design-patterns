package top50JavaInterQuestion;

import java.util.Scanner;

public class ReverseString {
    /*1.How to reverse a String in Java?*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();
        reverseString(text);
    }

    private static void reverseString(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input is null");
        }
        StringBuilder reversed = new StringBuilder();
        char[] chars = input.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed.append(chars[i]);
        }
        System.out.println(reversed.toString());
    }
}
