public class Reverse {
    public static void main(String[] args) {
        int n = 3210;
        System.out.print(reverseCharArrayRecc(n));
    }

    static int reverse(int number) {
        // Base case: if the number is a single digit or zero, return it
        if (number >= 0 && number < 10) {
            return number;
        }

        // Recursive case: reverse the number by appending the last digit
        // and recursively calling the method on the remaining digits
        int lastDigit = number % 10;
        int remainingDigits = number / 10;

        int reversedNumber = reverse(remainingDigits);
        // When we take the logarithm of a positive integer, the integer part of the
        // result will be one less than the number of digits in that integer.
        int numOfDigits = (int) Math.log10(remainingDigits) + 1;

        reversedNumber += lastDigit * Math.pow(10, numOfDigits);

        return reversedNumber;
    }

    static String reverseCharArrayRecc(int n) {
        if (n < 10) {
            return String.valueOf(n);
        }

        char[] charArray = String.valueOf(n).toCharArray();
        int length = charArray.length;

        return charArray[length - 1] + reverseCharArrayRecc(n / 10);
    }

    static void reverseCharArray(int n) {
        char[] charArray = String.valueOf(n).toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}
