package top50JavaInterQuestion;

import java.util.Scanner;

public class SwapTwoNums {
    /*2.How to swap two numbers without using a third variable?*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Swapped nums: ");
        swapNums(a, b);
    }

    private static void swapNums(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
