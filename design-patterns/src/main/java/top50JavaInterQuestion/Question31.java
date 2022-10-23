package top50JavaInterQuestion;

import java.util.Locale;

public class Question31 {
    /*31. Write a code to show NullPointerException*/
    public static void main(String[] args) {
        printString(null,3);
    }
    private static void printString(String text,int count){
        for(int i=0;i<count;i++){
            System.out.println(text.toLowerCase(Locale.ROOT));
        }
    }
}
