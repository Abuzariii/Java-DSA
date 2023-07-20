import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    public static void main(String[] args) {
        String str = "abc";
        List<String> permutations = permute(str);
        for (String permutation : permutations) {
            System.out.println(permutation);
        }

        System.out.println(permutations.size());
    }

    public static List<String> permute(String str) {
        List<String> result = new ArrayList<>();
        if (str.length() == 0) {
            result.add("");
            return result;
        }

        for (int i = 0; i < str.length(); i++) {
            String remainingChars = getRemainingCharacters(str, i);
            List<String> subPermutations = permute(remainingChars);
            for (String subPermutation : subPermutations) {
                result.add(str.charAt(i) + subPermutation);
            }
        }
        return result;
    }

    private static String getRemainingCharacters(String str, int index) {
        return str.substring(0, index) + str.substring(index + 1);
    }
}
