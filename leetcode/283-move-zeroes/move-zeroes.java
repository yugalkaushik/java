class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int zero = 0;
        while(zero < n && nums[zero] != 0){
            zero++;
        }
        if (zero == n) return;
        int i = zero+1;
        while(i<n){
            if(nums[i]!=0){
                nums[zero] = nums[i];
                nums[i] = 0;
                zero++;
            } 
            i++;
        }
    }
}