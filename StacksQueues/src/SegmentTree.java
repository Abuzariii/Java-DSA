class SegmentTree {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 7, 9, 11, 8, 13, 56 };
        SegmentTree segmentTree = new SegmentTree(nums);

        System.out.println(segmentTree.query(1, 5)); // Output: 24 (3 + 5 + 7 + 9)

        // segmentTree.update(2, 6);
        // System.out.println(segmentTree.query(1, 4)); // Output: 27 (3 + 6 + 7 + 11)
    }

    private int[] tree;
    private int n; // Size of the input array

    public SegmentTree(int[] nums) {
        n = nums.length;
        tree = new int[4 * n]; // Size of the segment tree array
        buildTree(nums, 0, 0, n - 1);
    }

    private void buildTree(int[] nums, int treeIndex, int left, int right) {
        if (left == right) {
            tree[treeIndex] = nums[left];
            return;
        }

        int mid = left + (right - left) / 2;
        buildTree(nums, 2 * treeIndex + 1, left, mid);
        buildTree(nums, 2 * treeIndex + 2, mid + 1, right);
        tree[treeIndex] = tree[2 * treeIndex + 1] + tree[2 * treeIndex + 2];
    }

    public int query(int queryLeft, int queryRight) {
        return query(0, 0, n - 1, queryLeft, queryRight);
    }

    private int query(int treeIndex, int left, int right, int queryLeft, int queryRight) {
        if (queryLeft > right || queryRight < left) {
            return 0; // Out of the query range
        }

        if (queryLeft <= left && queryRight >= right) {
            return tree[treeIndex]; // Node is fully within the query range
        }

        int mid = left + (right - left) / 2;
        int leftSum = query(2 * treeIndex + 1, left, mid, queryLeft, queryRight);
        int rightSum = query(2 * treeIndex + 2, mid + 1, right, queryLeft, queryRight);
        return leftSum + rightSum;
    }

    public void update(int index, int newValue) {
        update(0, 0, n - 1, index, newValue);
    }

    private void update(int treeIndex, int left, int right, int index, int newValue) {
        if (left == right) {
            tree[treeIndex] = newValue;
            return;
        }

        int mid = left + (right - left) / 2;
        if (index <= mid) {
            update(2 * treeIndex + 1, left, mid, index, newValue);
        } else {
            update(2 * treeIndex + 2, mid + 1, right, index, newValue);
        }
        tree[treeIndex] = tree[2 * treeIndex + 1] + tree[2 * treeIndex + 2];
    }
}