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
    public List<Integer> arr = new ArrayList();
    public int kthSmallest(TreeNode root, int k) {
        build(root);
        return arr.get(k-1);
    }
    public void build(TreeNode root){
        if(root == null) return;
        if(root.left != null) build(root.left);
        arr.add(root.val);
        if(root.right != null) build(root.right);
    }
}