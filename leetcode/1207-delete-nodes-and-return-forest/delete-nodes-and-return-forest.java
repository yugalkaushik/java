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
    HashSet<Integer> set = new HashSet<>();
    List<TreeNode> result = new ArrayList<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for(int i=0;i<to_delete.length;i++){
            set.add(to_delete[i]);
        }
        root = check(root);
        if (root != null) {
            result.add(root);
        }
        return result;
    }
    public TreeNode check(TreeNode root){
        if(root == null) return null;
        root.left = check(root.left);
        root.right = check(root.right);
        if(set.contains(root.val)){
            if(root.left!=null){
                result.add(root.left);
            }
            if(root.right!=null){
                result.add(root.right);
            }
            return null;
        }
        return root;
    }
}