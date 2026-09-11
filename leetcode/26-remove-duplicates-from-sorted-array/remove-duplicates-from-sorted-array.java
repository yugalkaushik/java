class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        set.add(nums[0]);
        int curr = 1;
        for(int i=1;i<nums.length;i++){
            if(set.contains(nums[i])){
                continue;
            }
            set.add(nums[i]);
            nums[curr] = nums[i];
            curr++;
        }
        return set.size();
    }
}