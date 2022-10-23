package top50JavaInterQuestion;

import java.util.Scanner;

public class FibonacciSeries {
    /*5.Fibonacci Series using recursion*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = scanner.nextInt();
        System.out.println(fibRec(num));
    }

    private static int fibRec(int num) {
        if (num <= 1) {
            return num;
        }
        return fibRec(num - 1) + fibRec(num - 2);
    }
}
