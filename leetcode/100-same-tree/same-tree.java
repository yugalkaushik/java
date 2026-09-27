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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> Q = new LinkedList<>();
        Q.offer(p);
        Q.offer(q);

        while (!Q.isEmpty()) {

            TreeNode curr1 = Q.poll();
            TreeNode curr2 = Q.poll();

            if (curr1 == null && curr2 == null) {
                continue;
            }

            if (curr1 == null || curr2 == null) {
                return false;
            }

            if (curr1.val != curr2.val) {
                return false;
            }

            Q.offer(curr1.left);
            Q.offer(curr2.left);

            Q.offer(curr1.right);
            Q.offer(curr2.right);
        }

        return true;
    }
}