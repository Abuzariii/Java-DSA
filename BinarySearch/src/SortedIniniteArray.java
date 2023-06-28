// Leetcode url : https://leetcode.com/problems/search-in-a-sorted-array-of-unknown-size/
// In this code I also used the timestamps to calculate the amount of time taken to execute the code

import java.util.Arrays;

public class SortedIniniteArray {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int target = 500001;

        int[] array = new int[5000000];

        for (int i = 0; i < 5000000; i++) {
            array[i] = i;
        }
        int index = search(array, target);
        System.out.println(index);

        // End timestamp
        long endTime = System.currentTimeMillis();

        // Calculate execution time in milliseconds
        long executionTime = endTime - startTime;

        // Print the execution time
        System.out.println("Execution time: " + executionTime + " milliseconds");
    }

    static int search(int[] array, int target) {
        int start = 0;
        int end = 1;

        // Keep expanding the range until the target is not within the range
        while (target > array[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            // end = end * 2;
            start = newStart;
        }

        // Perform binary search within the identified range
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == target) {
                return mid; // Found the target element
            } else if (array[mid] < target) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }

        return -1; // Target element not found
    }
}
