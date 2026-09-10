class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n<1) return;
        int i = 0;
        while(i < n && nums[i] != 0){
            i++;
        }
        int j = i+1;
        while(j<n){
            if(nums[j] != 0){
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
            }
            j++;
        }
        return;
    }
}