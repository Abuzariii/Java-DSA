public class App {
    public static void main(String[] args) {
        String str = "arslan khan";

        // startsWith(str);

        String empty = "";
        String target = "a";
        String skippedString = startsWiithRecursion(str, empty, 0, target);
        System.out.println(skippedString);
    }

    static String startsWiithRecursion(String str, String empty, int index, String target) {
        // If index is equal to string.length, return empty
        // Create substring starting from index
        // If substring doesn't start with target then add it to empty string
        // Run the function for index + 1
        if (index == str.length()) {
            return empty;
        }
        String a = str.substring(index, str.length());
        if (a.startsWith(target) == false) {
            empty = empty + a.charAt(0);
        }
        return startsWiithRecursion(str, empty, index + 1, target);
    }

    static void startsWith(String str) {
        for (int i = 0; i < str.length(); i++) {
            String a = str.substring(i, str.length());
            if (a.startsWith("apple") == true) {
                System.out.println("True");
                System.out.println(i);
            }
        }
    }
}
