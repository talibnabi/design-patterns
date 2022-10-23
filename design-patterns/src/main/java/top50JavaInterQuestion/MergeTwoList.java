package top50JavaInterQuestion;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoList {
    /*23.How to merge two lists in java?*/
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        List<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        System.out.println(mergedList);
    }
}
