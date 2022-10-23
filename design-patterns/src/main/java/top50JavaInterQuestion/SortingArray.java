package top50JavaInterQuestion;

import java.util.Arrays;

public class SortingArray {
    /*10.Sorting an array in Java?*/
    public static void main(String[] args) {
        int[] nums = {2, 23, 34, 2, 1, 3, 453};
//        sortWithMethod(nums);
        sortDescending(nums);
    }

    private static void sortWithMethod(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sortDescending(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int tmp = 0;
                if (nums[i] < nums[j]) {
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
            System.out.println(nums[i]);
        }
    }

    private static void sortAscending(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int tmp = 0;
                if (nums[i] > nums[j]) {
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
            System.out.println(nums[i]);
        }
    }
}
