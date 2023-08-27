import java.util.Scanner;

public class Fundamentals1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        scanner.close();

        int hcf = calculateHCF(a, b);
        int lcm = (a * b) / hcf;

        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);

        // System.out.println(HCFEuclidean());

        // table();

        // System.out.println(twoSum());

        // System.out.println(isLeapYear());
    }

    public static int calculateHCF(int a, int b) {
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public static int HCFEuclidean() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number : ");
        int b = scanner.nextInt();
        scanner.close();

        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public static void table() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for which you need the multiplication table : ");
        int a = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " X " + i + " = " + a * i);
        }
    }

    public static boolean isLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        scanner.close();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static int twoSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number : ");
        int b = scanner.nextInt();
        scanner.close();

        return a + b;
    }
}
