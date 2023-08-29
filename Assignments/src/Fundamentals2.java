public class Fundamentals2 {
    public static void main(String[] args) {
        String a = "abasba";

        System.out.println(isPalindromeString(a));

    }

    public static boolean isPalindromeString(String str) {
        int s = 0;
        int e = str.length() - 1;

        while (s <= e) {
            if (str.charAt(e) != str.charAt(s)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public static void fibonacci(int n) {
        int flag = 0;
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        while (flag <= n) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
            flag++;
        }
    }

    public static int dollarToPkr(int dollar) {
        return dollar * 300;
    }

    public static void largest(int a, int b) {
        if (a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println("b is greater");
        }
    }

    public static void operator(int a, int b, String op) {
        if (op == "*" || op == "x" || op == "X") {
            System.out.println(a * b);
        }
        if (op == "+") {
            System.out.println(a + b);
        }
        if (op == "-") {
            System.out.println(a - b);
        }
        if (op == "/") {
            System.out.println(a / b);
        }
    }

    public static void evenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
