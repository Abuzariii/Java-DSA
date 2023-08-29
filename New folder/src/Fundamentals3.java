import java.util.Scanner;

public class Fundamentals3 {
    public static void main(String[] args) {

        printPrimesInRange(3, 15);

    }

    public static void printPrimesInRange(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i > 1) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static int factorialRec(int n, int flag) {
        if (n == 0) {
            return 1;
        }

        return n * factorialRec(n - 1, flag);
    }

    public static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static boolean isPrime(int n) {
        if (n > 2) {
            for (int i = 2; i < (n / 2) + 1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isPalindormeNum(int n) {
        int start = 0;
        int end = Integer.toString(n).length() - 1;

        while (start <= end) {
            if ((Integer.toString(n).charAt(start)) != (Integer.toString(n).charAt(end))) {
                return false;
            }
            end--;
            start++;
        }
        return true;
    }

    public static void reverseString(String str) {
        char[] string = str.toCharArray();
        int start = 0;
        int end = str.toCharArray().length - 1;

        while (start < end) {
            char temp = string[start];
            string[start] = string[end];
            string[end] = temp;

            start++;
            end--;
        }
        System.out.println(string);
    }

    public static void largest() {
        int largest = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("Largest of all was : " + largest);
        scanner.close();
    }

    public static void sumTill0() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println("Sum of all numbers entered: " + sum);
        scanner.close();
    }

    public static void factors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static int subtractProdSum(int n) {
        int product = 1;
        int sum = 0;

        while (n != 0) {
            product *= n % 10;
            n = (n - (n % 10)) / 10;
        }
        while (n != 0) {
            sum += n % 10;
            n = (n - (n % 10)) / 10;
        }
        return product - sum;
    }
}
