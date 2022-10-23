package top50JavaInterQuestion;

import java.util.Scanner;

public class CheckPrime {
    /*4.Java program to check if the given number is Prime?*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println("Number is prime.");
            return;
        }
        System.out.println("Number is not prime.");
    }

    private static boolean isPrime(int number) {
        if (number == 0 || number == 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
