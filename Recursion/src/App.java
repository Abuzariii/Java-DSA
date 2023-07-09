public class App {
    public static void main(String[] args) {
        // 1, 1, 2, 3, 5, 8, 13
        System.out.println(fibo(3));
        System.out.println(fiboRecusrsion(5));
    }

    static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    static int fiboRecusrsion(int n) {
        if (n <= 1)
            return n;
        return fiboRecusrsion(n - 1) + fiboRecusrsion(n - 2);

        // fibo(2) --> + fibo(1) --> returns1
        // fibo(2) returns fibo(1) and fibo(0)

    }
}