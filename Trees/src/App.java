public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree tree = new BinaryTree();
        TreeNode root = null;

        root = tree.insert(root, 10);
        root = tree.insert(root, 5);
        root = tree.insert(root, 15);
        root = tree.insert(root, 3);
        root = tree.insert(root, 4);
        root = tree.insert(root, 18);
        root = tree.insert(root, 8);
        root = tree.insert(root, 21);
        root = tree.insert(root, 10);

        tree.displayTree(root, 0);

        // Find minimum element
        // ArrayList<Integer> arr = new ArrayList<>();
        // System.out.println(tree.findMinPreOrder(root, arr));

        // Find height
        // System.out.println(tree.height(root));

        // Find Diameter
        // System.out.println(tree.diameterThroughtRoot(root));

        // Find Balance Factor
        // System.out.println(tree.balanceFactor(root));

        // Check if tree is balanced or not
        // System.out.println(tree.isBalanced(root));
    }
}

// 6. **LCA in Binary Tree**: Write an algorithm to find the lowest common
// ancestor (LCA) of two nodes in a binary tree.

// 7. **Serialize and Deserialize**: Design an algorithm to serialize and
// deserialize a binary tree. Serialize means converting a tree into a string
// representation, and deserialize means reconstructing the original tree from
// the string.

// 8. **Binary Tree to Doubly Linked List**: Convert a binary search tree into a
// sorted doubly linked list in-place.

// 9. **Max Path Sum in Binary Tree**: Given a binary tree, find the maximum
// path sum. A path is defined as any sequence of nodes from some starting node
// to any node in the tree along the parent-child connections.

// 10. **Level Order Traversal**: Perform a level order traversal (also known as
// breadth-first traversal) on a binary tree.