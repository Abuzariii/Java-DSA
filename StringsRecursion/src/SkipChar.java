import java.util.ArrayList;

public class SkipChar {
    public static void main(String[] args) throws Exception {
        String name = "Abuzar";
        // System.out.println(removeChar(name));

        ArrayList<Character> list = new ArrayList<>();
        System.out.println(removeCharRec(name.toLowerCase(), list, 'a', 0));
    }

    static ArrayList<Character> removeCharRec(String str, ArrayList<Character> list, char target, int index) {
        // Base condition if index is equal to array.length()
        if (index == str.length()) {
            return list;
        }
        char[] strChar = str.toCharArray();

        if (strChar[index] != 'a') {
            list.add(strChar[index]);
        }

        return removeCharRec(str, list, target, index + 1);
    }

    static ArrayList<Character> removeChar(String str) {
        // Created an empty array list
        // Converted string to lowercase (which we can do in arguement too)
        // Converted it to a char array
        // If the current character is not equal to target then add it to array list
        // return the array list
        ArrayList<Character> list = new ArrayList<>();

        str = str.toLowerCase();
        char[] strChar = str.toCharArray();

        for (char i : strChar) {
            if (i != 'a') {
                list.add(i);
            }
        }

        return list;
    }
}
