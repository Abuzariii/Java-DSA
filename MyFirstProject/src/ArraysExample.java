import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        String arrayAsString = Arrays.deepToString(matrix);

        System.out.println(arrayAsString);
    }
}
