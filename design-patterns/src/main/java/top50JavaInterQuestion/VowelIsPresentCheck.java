package top50JavaInterQuestion;

import java.util.Scanner;

public class VowelIsPresentCheck {
    /*3.Java Program to check if a vowel is present in the string?*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String input = scanner.nextLine();
        if (checkVowelIsPresent(input)) {
            System.out.println("Vowel is present");
            return;
        }
        System.out.println("Vowel is not present");
    }

    private static boolean checkVowelIsPresent(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
