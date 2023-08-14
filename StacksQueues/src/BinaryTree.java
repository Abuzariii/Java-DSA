// This is both a binary and binary search tree

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    TreeNode root;

    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public void displayTree(TreeNode root, int level) {
        if (root != null) {
            displayTree(root.right, level + 1);
            System.out.println(" ".repeat(6 * level) + "-> " + root.value);
            displayTree(root.left, level + 1);
        }
    }

    public boolean search(TreeNode root, int value) {
        if (root == null) {
            return false;
        }

        if (root.value == value) {
            return true;
        }

        return search(root.left, value) || search(root.right, value);
    }

    public TreeNode delete(TreeNode root, int value) {
        if (root == null) {
            return null;
        }

        if (value < root.value) {
            root.left = delete(root.left, value);
        } else if (value > root.value) {
            root.right = delete(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Case 2: Node has two children
            root.value = minValue(root.right);
            root.right = delete(root.right, root.value);
        }
        return root;
    }

    private int minValue(TreeNode root) {
        int minValue = root.value;
        while (root.left != null) {
            minValue = root.left.value;
            root = root.left;
        }
        return minValue;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeNode root = null;
        root = tree.insert(root, 10);
        root = tree.insert(root, 5);
        root = tree.insert(root, 15);
        root = tree.insert(root, 3);
        root = tree.insert(root, 7);
        root = tree.insert(root, 20);
        root = tree.insert(root, 18);
        root = tree.insert(root, 23);
        root = tree.insert(root, 16);
        root = tree.insert(root, 29);
        root = tree.insert(root, 10);
        root = tree.insert(root, 0);
        root = tree.insert(root, 1);

        tree.displayTree(root, 0);

        // System.out.println(tree.search(root, 180));

        // root = tree.delete(root, 18);
        // System.out.println("Tree after deleting node with value " + 18 + ":");
        // tree.displayTree(root, 0);

    }
}
