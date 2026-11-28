class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int length = Integer.MAX_VALUE;
        int n = nums.length;
        int l = 0;
        int sum = 0;
        for(int r=0;r<n;r++){
            sum += nums[r];
            while(sum >= target){
                length = Math.min(length, r - l + 1);
                sum -= nums[l];
                l++;
            }
        }
        if(length == Integer.MAX_VALUE) return 0;
        else return length;
    }
}