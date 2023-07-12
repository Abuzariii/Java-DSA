public class App {

    // static boolean isPalindrome(int n) {
    // if (printDigits(n) == printDigitsReverse(n)) {
    // }
    // }
    static int sum = 0;

    static void printDigitsReverse(int n) {
        if (n == 0) {
            return;
        }
        int rem = n & 10;
        sum = sum * 10 + rem;
        printDigitsReverse(n / 10);
    }

    public static void main(String[] args) throws Exception {
        printDigitsReverse(132660);
        // printDigits(4333);
    }

    static int printDigits(int n) {
        if (n == 0) {
            return 0;
        }
        // Reverse it by swapping up down the below two lines
        printDigits(n / 10);
        System.out.print((n % 10));
        return n % 10;
    }

    static int prodDigits(int n) {
        if (n == 0) {
            return 0;
        }
        // Modulo of any number by 10 is the last digit
        // Dividing any number by 10 takes away the last digit
        // So we just return the sum of both
        return (n % 10) * prodDigits(n / 10);
    }

    static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        // Modulo of any number by 10 is the last digit
        // Dividing any number by 10 takes away the last digit
        // So we just return the sum of both
        return n % 10 + sumDigits(n / 10);
    }

    static void reverseRange(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        reverseRange(n - 1);

    }

    static void frwrdRange(int n) {
        if (n == 0) {
            return;
        }
        // It goes to the end node in the tree and then starts printing from there lol
        frwrdRange(n - 1);
        System.out.println(n);
    }

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    static int sumRange(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + sumRange(n - 1);
    }

}
