package top50JavaInterQuestion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Question30 {
    /*30.Write a Program to show try catch example?*/
    public static void main(String[] args) {
        checkTryCatch("text.txt");
        checkTryCatch();
    }

    private static void checkTryCatch(String filePath) {
        try {
            FileInputStream inputStream = new FileInputStream(filePath);
            System.out.println("Yes");
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    private static void foo(int num) {
        System.out.println(num);
    }

    private static void checkTryCatch() {
        try {
            foo(10);
        } catch (IllegalArgumentException | NullPointerException ex) {
            ex.printStackTrace();
        }
    }

}
