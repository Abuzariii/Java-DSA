import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.add(5);
        stack.add(6);
        stack.add(7);
        stack.add(8);
        stack.add(9);

        // Display the entire stack using forEach method
        // stack.forEach(System.out::print);

        // Convert the stack to an array
        Integer[] stackArray = stack.toArray(new Integer[stack.size()]);
        // Loop through the array and print the elements
        for (Integer item : stackArray) {
            System.out.print(item + " --> ");
        }
        System.out.print("NULL");
    }
}
