import java.util.TreeSet;

public class Trees {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(6);
        treeSet.add(9);

        for (Integer value : treeSet) {
            System.out.print(value + " ");
        }
    }
}
