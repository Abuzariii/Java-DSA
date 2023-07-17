import java.util.Arrays;

public class MergeSortRec {
    public static void main(String[] args) {
        int[] array = { 1, 8, 3, 9, 4, 5, 2, 7, 6 };
        System.out.println(Arrays.toString(mergeSort(array)));
    }

    static int[] mergeSort(int[] arr) {
        // Base condition
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        // Divide original array into two halves
        // These recursion calls will keep dividing the arrays into halves until there
        // are n number of halves
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // Wait for the halves to be reduced to one element before merging them
        // So there will be n number of splits in the array before the merging begins
        // Below call will run while emptying the stack
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        // 3 pointers to the first, second and mix array
        int i = 0;
        int j = 0;
        int k = 0;

        // Compare the corresponding indexes of both arrays and update the mix
        // accordingly
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements, only one of the blow loops will run
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
