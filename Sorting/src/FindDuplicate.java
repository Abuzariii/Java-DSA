// Leetcode url : https://leetcode.com/problems/find-the-duplicate-number/

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 2, 3, 3 };

        System.out.println(missingNumber(nums));

    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
