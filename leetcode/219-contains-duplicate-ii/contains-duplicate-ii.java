class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        for(int j=0;j<n;j++){
            if(set.contains(nums[j])){
                return true;
            }
            set.add(nums[j]);
            if(j - i == k){
                set.remove(nums[i]);
                i++;
            }
        }
        return false;
    }
}