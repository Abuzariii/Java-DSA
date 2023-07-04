import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = { 121, 1, 13, 3, 2, 5, 6, 12, 10 };

        bubbleSort(array);

        System.out.println(Arrays.toString(array));
    }

    static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }
}
