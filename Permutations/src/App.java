import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> permutations = permute(nums);
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
        System.out.println(permutations.size());
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Base condition, add an empty array list to the list of array lists if the
        // array length is zero
        if (nums.length == 0) {
            List<Integer> emptyList = new ArrayList<>();
            result.add(emptyList);
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            // Get remaining elements
            int[] remainingNums = getRemainingElements(nums, i);
            // Recursion call
            List<List<Integer>> subPermutations = permute(remainingNums);

            // This runs when emptying the stack
            // Iterate through each permutation in the subPermutations list generated above
            for (List<Integer> subPermutation : subPermutations) {
                // Create a new array list for each permutation
                List<Integer> permutation = new ArrayList<>();
                // Add the element at that index to the above array list
                // It will be our first element
                permutation.add(nums[i]);
                // Add all the elements of the current subPermutation to the permutation list.
                permutation.addAll(subPermutation);
                // Add the permutation to the result
                result.add(permutation);
            }
        }
        return result;
    }

    private static int[] getRemainingElements(int[] nums, int index) {
        int[] remainingNums = new int[nums.length - 1];
        System.arraycopy(nums, 0, remainingNums, 0, index);
        System.arraycopy(nums, index + 1, remainingNums, index, nums.length - index - 1);
        return remainingNums;
    }
}
