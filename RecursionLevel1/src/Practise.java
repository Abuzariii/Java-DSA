// These are solutions to all the problems Kunal solved without using recursion

public class Practise {
    public static void main(String[] args) {
        int number = 123;
        System.out.println(numZeros(number));
        reverse(number);
        prodDigits(number);
        sumDigits(number);
        isPalindrome(number);
        reverseAlt(number);

    }

    static void isPalindrome(int number) {
        int reversed = 0;
        int original = number;

        // Reverse the number
        while (number > 0) {
            int digit = number % 10;
            reversed = (reversed * 10) + digit;
            number /= 10;
        }

        System.out.println(original == reversed);
    }

    static void sumDigits(int number) {
        char[] charArray = String.valueOf(number).toCharArray();
        int sum = 0;
        for (char i : charArray) {
            int value = Character.getNumericValue(i);
            sum += value;
        }
        System.out.println(sum);
    }

    static void prodDigits(int number) {
        char[] charArray = String.valueOf(number).toCharArray();
        int product = 1;
        for (char i : charArray) {
            int value = Character.getNumericValue(i);
            product *= value;
        }
        System.out.println(product);
    }

    static void reverseAlt(int number) {
        int reversed = 0;
        // Reverse the number
        while (number > 0) {
            // Get the last digit
            int digit = number % 10;
            // Add the digit to the reversed variable
            reversed = (reversed * 10) + digit;
            // Remove the last digit
            number /= 10;
        }
        System.out.println(reversed);
    }

    static void reverse(int number) {
        char[] charArray = String.valueOf(number).toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }

    static int numZeros(int number) {
        int count = 0;
        for (char i : String.valueOf(number).toCharArray()) {
            if (i == '0') {
                count++;
            }
        }
        return count;
    }
}
