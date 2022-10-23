package top50JavaInterQuestion;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrint {
    /*22. How to print date in specific format?*/
    public static void main(String[] args) {
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        String date = dateFormat.format(new Date());
        System.out.println(date);
    }
}
