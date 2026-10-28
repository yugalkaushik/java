class Solution {
    public int removeDuplicates(int[] nums) {
        int pos = 0;
        int n = nums.length;
        int count = 2;
        int prev = nums[0];
        for(int i=0;i<n;i++){
            int temp = nums[pos];
            nums[pos] = nums[i];
            nums[i] = nums[pos];
            if(nums[i]==prev && count>0){
                count--;
                pos++;
            } else if(nums[i]!=prev){
                count = 1;
                prev = nums[i];
                pos++;
            }
            
        }
        return pos;
    }
}