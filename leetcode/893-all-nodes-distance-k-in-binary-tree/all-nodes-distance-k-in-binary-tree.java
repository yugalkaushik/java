/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<TreeNode,TreeNode> map = new HashMap<>();
    TreeNode tn;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> result = new ArrayList<>();
        inorder(root,target);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(tn);

        HashSet<TreeNode> set = new HashSet<>();
        int level = 0;

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();

                if(set.contains(curr)) continue;
                set.add(curr);
                if(level==k){
                    result.add(curr.val);
                }
                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }

                if (map.containsKey(curr)) {
                    q.offer(map.get(curr));
                }
            }
            if (level == k) break;
            level++;
        }
        return result;
    }
    public void inorder(TreeNode root,TreeNode target){
        if(root == null) return;
        if(root.left != null) map.put(root.left,root);
        inorder(root.left,target);
        if(root == target) tn = root;
        if(root.right != null) map.put(root.right,root);
        inorder(root.right,target);
    }
}