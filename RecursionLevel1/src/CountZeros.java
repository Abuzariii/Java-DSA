public class CountZeros {
    public static int countZeros(int number) {
        if (number == 0) {
            return 1; // Base case: If the number itself is zero, return 1
        }

        if (number < 10) {
            return 0; // Base case: If the number is a single digit and not zero, return 0
        }

        int lastDigit = number % 10; // Extract the last digit
        int remainingDigits = number / 10; // Get the remaining digits

        if (lastDigit == 0) {
            return 1 + countZeros(remainingDigits); // If last digit is zero, count it and
            // recursively count zeros in remaining digits
        } else {
            return countZeros(remainingDigits); // If last digit is not zero, recursively
            // count zeros in remaining digits
        }
    }

    public static void main(String[] args) {
        int number = 1020304;
        int zeroCount = countZeros(number);
        System.out.println("Number of zeros: " + zeroCount);
    }
}
