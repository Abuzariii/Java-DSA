import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        // Find an element in the array using conditionals and for loops
        // int[] nums = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };

        // System.out.print("Enter the number you want to find: ");
        // Scanner input = new Scanner(System.in);
        // int target = input.nextInt();

        // boolean flag = false;

        // for (int i = 0; i < nums.length; i++) {
        // int element = nums[i];

        // if (element == target) {
        // flag = true;
        // System.out.println("Target value " + target + " was found at index " + i);
        // break;
        // }
        // }
        // if (!flag) {
        // System.out.println("Target value " + target + " not found in the array.");
        // }

        // Find an element in the array using an int function
        // int[] numbers = { 2, 4, 6, 8, 10 };
        // System.out.print("Enter the number you want to find : ");
        // Scanner input = new Scanner(System.in);
        // int target = input.nextInt();
        // // Use the function
        // int index = findIndex(numbers, target);

        // if (index != -1) {
        // System.out.println("Target value " + target + " found at index " + index);
        // } else {
        // System.out.println("Target value " + target + " not found in the array.");
        // }

        // Find a element inside an array using a boolean function
        // Strings are also arrays as they contain characters
        // Strings are not primitive data types in Java, primitive data types are those
        // which cannot be further subdivided into any data type, as strings can be
        // further subdivided into chars, so they aren't primitives
        // String name = "Abuzar";
        // System.out.print("Enter the character you want to find : ");
        // Scanner input = new Scanner(System.in);
        // char target = input.next().charAt(0);
        // // Use the function
        // boolean index = checkChar(name, target);
        // System.out.println(index);

        // Seacrh within a given range for example from index i to j
        // int[] nums = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
        // System.out.print("Enter the number you want to find: ");
        // Scanner input = new Scanner(System.in);
        // int target = input.nextInt();

        // boolean flag = false;

        // // Just search within index 2 to 5
        // for (int i = 2; i <= 5; i++) {
        // int element = nums[i];

        // if (element == target) {
        // flag = true;
        // System.out.println("Target value " + target + " was found at index " + i);
        // break;
        // }
        // }
        // if (!flag) {
        // System.out.println("Target value " + target + " not found in the given
        // range.");
        // }

        // Find the minimum number
        // int[] nums = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
        // int min = nums[0];

        // for (int i = 1; i < nums.length; i++) {
        // if (nums[i] < min) {
        // min = nums[i];
        // }
        // }
        // System.out.println("Smallest value: " + min);

        // Find the maximum number
        // int[] nums = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
        // int min = nums[0];

        // for (int i = 1; i < nums.length; i++) {
        // if (nums[i] > min) {
        // min = nums[i];
        // }
        // }
        // System.out.println("Largest value: " + min);
    }

    // public static int findIndex(int[] array, int target) {
    // for (int i = 0; i < array.length; i++) {
    // if (array[i] == target) {
    // return i;
    // }
    // }
    // return -1;
    // }

    // public static boolean checkChar(String str, char target) {
    // // For loop
    // // for (int i = 0; i < str.length(); i++) {
    // // if (target == str.charAt(i)) {
    // // return true;
    // // }
    // // }
    // // return false;

    // // For each loop
    // for (char ch : str.toCharArray()) {
    // if (ch == target) {
    // return true;
    // }
    // }
    // return false;
    // }
}