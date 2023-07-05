// Leetcode url : https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4 };

        int[] result = findErrorNums(nums);

        System.out.println(Arrays.toString(result));
    }

    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                result[0] = Math.abs(nums[i]);
            } else {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[1] = i + 1;
                break;
            }
        }

        return result;
    }
}
