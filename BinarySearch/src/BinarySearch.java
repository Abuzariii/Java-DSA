import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        // Read the target from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number you want to search the index of : ");
        int target = scanner.nextInt();
        int index = bnSearch(arr, target);
        System.out.println("Given value was found at index " + index);
    }

    static int bnSearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            // Find the middle element
            int mid = (start + end) / 2;

            // If target is bigger than the element at mid then point start at the value
            // next to mid and keep the end unchanged
            if (target > array[mid]) {
                start = mid + 1;
            }
            // If target is lesser than the element at mid then point end at the value
            // previous to mid and keep the start unchanged
            else if (target < array[mid]) {
                end = mid - 1;
            }
            // Finally if mid is equal to target then return mid
            else {
                return mid;
            }
        }

        return -1;
    }
}
