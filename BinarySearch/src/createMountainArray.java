import java.util.Arrays;
import java.util.Scanner;

public class createMountainArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter array size
        System.out.print("Size of the array ? ");
        int size = input.nextInt();
        input.close();
        int[] array = createMountain(size);
        System.out.println(Arrays.toString(array));
    }

    public static int[] createMountain(int size) {
        int[] mountainArray = new int[size];
        int peakIndex = mountainArray.length / 2;

        // Fill the left side of the mountain array (increasing elements)
        for (int i = 0; i < peakIndex; i++) {
            mountainArray[i] = i + 1;
        }

        // Fill the right side of the mountain array (decreasing elements)
        for (int i = peakIndex, j = peakIndex - 1; i < mountainArray.length; i++, j--) {
            mountainArray[i] = j;
        }

        // System.out.println(Arrays.toString(mountainArray));
        return mountainArray;
    }
}
