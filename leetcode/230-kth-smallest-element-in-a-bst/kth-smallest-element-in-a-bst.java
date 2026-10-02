/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int index = 0;
    public int value = 0;
    public int kthSmallest(TreeNode root, int k) {
        index = k;
        build(root);
        return value;
    }
    public void build(TreeNode root){
        if(root == null) return;
        if(root.left != null) build(root.left);
        index--;
        if(index==0) value = root.val;
        if(root.right != null) build(root.right);
    }
}