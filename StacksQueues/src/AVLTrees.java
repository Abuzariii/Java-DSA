public class AVLTrees {
    public static class TreeNode {
        int val;
        int height;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.height = 1;
        }
    }

    public static class AVLTree {
        TreeNode root;

        int height(TreeNode node) {
            if (node == null) {
                return 0;
            }
            return node.height;
        }

        int balanceFactor(TreeNode node) {
            if (node == null) {
                return 0;
            }
            return height(node.left) - height(node.right);
        }

        TreeNode rotateRight(TreeNode y) {
            TreeNode x = y.left;
            TreeNode T2 = x.right;

            x.right = y;
            y.left = T2;

            y.height = Math.max(height(y.left), height(y.right)) + 1;
            x.height = Math.max(height(x.left), height(x.right)) + 1;

            return x;
        }

        TreeNode rotateLeft(TreeNode x) {
            TreeNode y = x.right;
            TreeNode T2 = y.left;

            y.left = x;
            x.right = T2;

            x.height = Math.max(height(x.left), height(x.right)) + 1;
            y.height = Math.max(height(y.left), height(y.right)) + 1;

            return y;
        }

        TreeNode insert(TreeNode node, int val) {
            if (node == null) {
                return new TreeNode(val);
            }

            if (val < node.val) {
                node.left = insert(node.left, val);
            } else if (val > node.val) {
                node.right = insert(node.right, val);
            } else {
                return node; // Duplicate values not allowed
            }

            node.height = 1 + Math.max(height(node.left), height(node.right));

            int balance = balanceFactor(node);

            if (balance > 1 && val < node.left.val) {
                return rotateRight(node);
            }

            if (balance < -1 && val > node.right.val) {
                return rotateLeft(node);
            }

            if (balance > 1 && val > node.left.val) {
                node.left = rotateLeft(node.left);
                return rotateRight(node);
            }

            if (balance < -1 && val < node.right.val) {
                node.right = rotateRight(node.right);
                return rotateLeft(node);
            }

            return node;
        }

        void insert(int val) {
            root = insert(root, val);
        }

        void inOrderTraversal(TreeNode node) {
            if (node != null) {
                inOrderTraversal(node.left);
                System.out.print(node.val + " ");
                inOrderTraversal(node.right);
            }
        }

        void printInOrder() {
            inOrderTraversal(root);
            System.out.println();
        }

        void displayTree(TreeNode root, int level) {
            if (root != null) {
                displayTree(root.right, level + 1);
                System.out.println(" ".repeat(6 * level) + "-> " + root.val);
                displayTree(root.left, level + 1);
            }
        }

        public TreeNode delete(TreeNode root, int value) {
            if (root == null) {
                return null;
            }

            if (value < root.val) {
                root.left = delete(root.left, value);
            } else if (value > root.val) {
                root.right = delete(root.right, value);
            } else {
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }
                // Case 2: Node has two children
                root.val = minValue(root.right);
                root.right = delete(root.right, root.val);
            }
            return root;
        }

        private int minValue(TreeNode root) {
            int minValue = root.val;
            while (root.left != null) {
                minValue = root.left.val;
                root = root.left;
            }
            return minValue;
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);

        tree.delete(tree.root, 25);
        // This tree ignores duplicate values
        // tree.insert(25);

        tree.displayTree(tree.root, 0);
        // tree.inOrderTraversal(tree.root);
    }
}
