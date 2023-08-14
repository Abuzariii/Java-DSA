// This is both a binary and binary search tree

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.right = null;
        this.left = null;
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

    public boolean isPerfect(TreeNode root) {
        int depth = calculateDepth(root);
        return isPerfect(root, depth, 0);
    }

    private boolean isPerfect(TreeNode node, int depth, int level) {
        if (node == null) {
            return true;
        }

        // If the node is a leaf, check if it's at the expected level
        if (node.left == null && node.right == null) {
            return level == depth - 1;
        }

        // If the node has only one child, it's not a perfect tree
        if (node.left == null || node.right == null) {
            return false;
        }

        // Recursively check the left and right subtrees
        return isPerfect(node.left, depth, level + 1) && isPerfect(node.right, depth, level + 1);
    }

    private int calculateDepth(TreeNode node) {
        int depth = 0;
        while (node != null) {
            depth++;
            node = node.left;
        }
        return depth;
    }

    public void preorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.value + " "); // Process the current node
            preorder(root.left); // Traverse left subtree
            preorder(root.right); // Traverse right subtree
        }
    }

    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left); // Traverse left subtree
            System.out.print(root.value + " "); // Process the current node
            inorder(root.right); // Traverse right subtree
        }
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
        // root = tree.insert(root, 18);
        // root = tree.insert(root, 23);
        root = tree.insert(root, 14);
        // root = tree.insert(root, 29);
        // root = tree.insert(root, 19);
        // root = tree.insert(root, 21);

        tree.displayTree(root, 0);

        // System.out.println(tree.search(root, 180));
        // System.out.println(tree.isPerfect(root));

        // root = tree.delete(root, 20);
        // System.out.println("Tree after deleting node with value " + 20 + ":");
        // tree.displayTree(root, 0);
        tree.inorder(root);

    }
}
