class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int l = 0;
        long sum = 0;
        long maxS = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int r = 0; r < nums.length; r++){
            while(set.contains(nums[r])){
                sum -= nums[l];
                set.remove(nums[l]);
                l++;
            }
            set.add(nums[r]);
            sum += nums[r];
            if(r-l+1 > k){
                set.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
            if(r-l+1 == k){
                maxS = Math.max(maxS,sum);
            }
        }
        return maxS;
    }
}