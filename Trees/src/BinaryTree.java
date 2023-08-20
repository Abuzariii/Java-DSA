// This is both a binary and binary search tree

import java.util.ArrayList;

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
            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);
        }
    }

    // Find the minimum value using a preorder traversal
    public int findMinPreOrder(TreeNode root, ArrayList<Integer> arr) {
        // Add all the values in the array list
        if (root != null) {
            arr.add(root.value);
            findMinPreOrder(root.left, arr);
            findMinPreOrder(root.right, arr);
        }

        // Return the smallest element in the array list
        if (arr == null || arr.isEmpty()) {
            throw new IllegalArgumentException("ArrayList is empty or null.");
        }
        int smallest = arr.get(0); // Initialize with the first element
        for (int i = 1; i < arr.size(); i++) {
            int current = arr.get(i);
            if (current < smallest) {
                smallest = current;
            }
        }
        return smallest;
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int h = Math.max(height(root.left), height(root.right)) + 1;
        return h;
    }

    public int diameterThroughtRoot(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int diameter = height(root.left) + height(root.right) + 1;
        return diameter;
    }

    public int balanceFactor(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    public boolean isBalanced(TreeNode root) {
        if (root != null) {
            int balanceFactor = height(root.left) - height(root.right);
            if (balanceFactor > 1 || balanceFactor < -1) {
                return false;
            }

            isBalanced(root.left);
            isBalanced(root.right);
        }
        return true;
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
        root = tree.insert(root, 14);

        tree.displayTree(root, 0);

        // System.out.println(tree.search(root, 180));
        // System.out.println(tree.isPerfect(root));

        // root = tree.delete(root, 20);
        // System.out.println("Tree after deleting node with value " + 20 + ":");
        // tree.displayTree(root, 0);
        // tree.inorder(root);

    }
}
