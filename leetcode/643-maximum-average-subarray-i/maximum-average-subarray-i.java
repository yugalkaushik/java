class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxA = Integer.MIN_VALUE;
        double sum = 0.0;
        int l = 0;
        int n = nums.length;
        for(int r=0;r<n;r++){
            sum += nums[r];
            if(r<k-1) continue;
            maxA = Math.max(maxA,sum/k);
            sum = sum - nums[l];
            l++;
        }
        return maxA;
    }
}