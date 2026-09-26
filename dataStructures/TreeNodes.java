package dataStructures;

public class TreeNodes {
    
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        // Constructors
        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

        // Using the value-only constructor
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        // Using the constructor with value, left child and right child
        root.left.left = new TreeNode(
            4,
            new TreeNode(6),
            new TreeNode(7)
        );

        root.left.right = new TreeNode(5);
    }
}
