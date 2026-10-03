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
    public int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        check(root);
        return max;
    }
    public int check(TreeNode root){
        if(root == null) return 0;
        int left = check(root.left);
        int right = check(root.right);
        left = Math.max(0,left);
        right = Math.max(0,right);
        max = Math.max(max,left+right+root.val);
        return root.val + Math.max(left,right);
    }
}