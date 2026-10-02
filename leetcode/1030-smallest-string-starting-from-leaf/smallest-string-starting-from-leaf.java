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
    public String answer = "";
    public String smallestFromLeaf(TreeNode root) { 
        find(root,"");
        return answer;
    }
    public void find(TreeNode root, String path){
        char c = (char) ('a' + root.val);
        path = c + path;
        if(root.left == null && root.right == null){
            if(answer == "" || path.compareTo(answer)<0){
                answer = path;
            }
            return;
        }
        if(root.left != null){
            find(root.left,path);
        }
        if(root.right != null){
            find(root.right,path);
        }
    }
}