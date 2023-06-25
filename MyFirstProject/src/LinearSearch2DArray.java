public class LinearSearch2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        // int target = 7;
        // boolean flag = false;
        // int min = arr[0][0];

        // Java first takes rows and then columns
        // for (int row = 0; row < arr.length; row++) {
        // for (int col = 0; col < arr[row].length; col++) {
        // System.out.print(arr[row][col] + " ");
        // }
        // System.out.println();
        // }

        // Find a value and print its index
        // for (int row = 0; row < arr.length; row++) {
        // for (int col = 0; col < arr[row].length; col++) {
        // if (arr[row][col] == target) {
        // flag = true;
        // System.out.println("Value was found at index (" + row + ", " + col + ")");
        // }
        // }
        // }
        // if (!flag) {
        // System.out.println("Value was not found");
        // }

        // Find the minimum value using for loop
        // for (int row = 0; row < arr.length; row++) {
        // for (int col = 0; col < arr[row].length; col++) {
        // if (arr[row][col] < min) {
        // min = arr[row][col];
        // }
        // }
        // }
        // System.out.println("Minimum value is " + min);

        // Find the minimum value using for each loop
        // for (int row[] : arr) {
        // for (int col : row) {
        // if (col < min) {
        // min = col;
        // }
        // }
        // }
        // System.out.println("Minimum value is " + min);

    }
}
