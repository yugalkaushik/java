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
    public int rob(TreeNode root) {
        int[] value = check(root);
        return Math.max(value[0],value[1]);
    }
    public int[] check(TreeNode root){
        if (root == null) {
            return new int[]{0, 0};
        }
        int[] left = check(root.left);
        int[] right = check(root.right);
        int[] curr = new int[2];
        curr[0] = root.val + left[1] + right[1];
        curr[1] = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);
        return curr;
    }
}