class Solution {
    Map<Integer, Integer> map = new HashMap<>();

    public int[] findMode(TreeNode root) {
        build(root);
        int max = 0;
        for (int value : map.values()) {
            max = Math.max(max, value);
        }
        List<Integer> array = new ArrayList();
        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                array.add(key);
            }
        }
        int[] result = new int[array.size()];
        for(int i=0;i<result.length;i++){
            result[i] = array.get(i);
        }
        return result;
    }

    public void build(TreeNode root) {
        if (root == null) return;

        map.put(root.val, map.getOrDefault(root.val, 0) + 1);

        if (root.left != null) {
            build(root.left);
        }

        if (root.right != null) {
            build(root.right);
        }
    }
}