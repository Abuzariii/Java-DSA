// Leetcode url : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

// This is brute force solution

import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] array = { 1, 2, 4, 6, 6, 7, 8, 8, 9 };
        int target = 6;

        int[] indexes = firstLast(array, target);
        System.out.println(Arrays.toString(indexes));
    }

    static int[] firstLast(int[] nums, int target) {
        int[] ans = { -1, -1 };

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans[0] = i;
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}
