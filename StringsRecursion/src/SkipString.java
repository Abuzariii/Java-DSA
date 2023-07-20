public class SkipString {
    public static String skipString(String input, String skip) {
        if (input.isEmpty()) {
            return input;
        }

        if (input.startsWith(skip)) {
            return skipString(input.substring(skip.length()), skip);
        } else {
            return input.charAt(0) + skipString(input.substring(1), skip);
        }
    }

    public static void main(String[] args) {
        String input = "akljasdapplejapples";
        String skip = "apple";
        String result = skipString(input, skip);
        System.out.println(result); // Output: "akljasdjhas"
    }
}
