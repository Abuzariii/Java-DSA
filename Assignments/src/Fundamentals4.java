public class Fundamentals4 {
    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
    public static boolean[] kidsCadnies(int[] candies, int extras) {
        int max = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        boolean[] ans = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extras >= max) {
                ans[i] = true;
            } else {
                ans[i] = false;
            }
        }

        return ans;
    }

    // https://leetcode.com/problems/number-of-good-pairs
    public static int goodPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j && i < j) {
                    count++;
                }
            }
        }
        return count;
    }
}
