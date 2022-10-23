package top50JavaInterQuestion;

import java.util.ArrayList;
import java.util.List;

public class Question37 {
    /*37. How to use forEach() method?*/
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(34);
        list.add(94);
        list.forEach(System.out::println);
    }
}
