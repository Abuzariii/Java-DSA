import java.util.Arrays;

public class FindMountainArray {
    public static void main(String[] args) {

        int[] array = createMountainArray.createMountain(120);

        System.out.println(Arrays.toString(array));
        System.out.println(searchMountain(array, 6));

    }

    public static int searchMountain(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
