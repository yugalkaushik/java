class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int pos = 0;
        int i = 0;
        while(i<n && pos<n){
            if(nums[pos]%2==0){
                pos++;
                continue;
            }
            if(nums[i]%2==0 && i>pos){
                int temp = nums[pos];
                nums[pos] = nums[i];
                nums[i] = temp;
                pos++; 
            }
            i++;
        }
        return nums;
    }
}