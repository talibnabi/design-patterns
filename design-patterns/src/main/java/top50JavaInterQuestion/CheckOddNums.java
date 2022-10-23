package top50JavaInterQuestion;


import java.util.Arrays;
import java.util.List;

public class CheckOddNums {
    /*6.Check if a List of integers contains only odd numbers?*/

    public static void main(String[] args) {
        List<Integer> numsList = Arrays.asList(3, 1, 3, 5, 3, 3, 3);
//        if (checkOdd(numsList)) {
//            System.out.println("Odd numbers");
//            return;
//        }
//        System.out.println("Failure");
        System.out.println(onlyOddNums(numsList));
    }

    private static boolean checkOdd(List<Integer> nums) {
        for (int num : nums) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean onlyOddNums(List<Integer> nums) {
        return nums.parallelStream().allMatch(x -> x % 2 != 0);
    }
}
