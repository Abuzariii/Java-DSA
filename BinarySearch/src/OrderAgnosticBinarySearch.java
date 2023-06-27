import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        // Read the target from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number you want to search the index of : ");
        int target = scanner.nextInt();
        int index = orderAgnBnSearch(arr, target);
        System.out.println("Given value was found at index " + index);
    }

    static int orderAgnBnSearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        // Find whether the array is sorted in ascending or descending
        boolean isAsc = array[start] < array[end];

        while (start <= end) {
            int mid = (start + end) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target > array[mid]) {
                    start = mid + 1;
                } else if (target < array[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else {
                if (target < array[mid]) {
                    start = mid + 1;
                } else if (target > array[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
