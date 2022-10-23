package top50JavaInterQuestion;

import java.util.*;

public class SortHashMap {
    /*24.How to Sort HashMap by values?*/
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("David", 95);
        scores.put("Jane", 80);
        scores.put("Mary", 97);
        scores.put("Lisa", 78);
        scores.put("Dino", 65);
        scores = sortByValue(scores);
        System.out.println(scores);
    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> scores) {
        Map<String, Integer> sortByValue = new LinkedHashMap<>();
        Set<Map.Entry<String, Integer>> entrySet = scores.entrySet();
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
        entryList.sort(Map.Entry.comparingByValue());
        for (Map.Entry<String, Integer> list : entryList) {
            sortByValue.put(list.getKey(), list.getValue());
        }
        return sortByValue;
    }
}
