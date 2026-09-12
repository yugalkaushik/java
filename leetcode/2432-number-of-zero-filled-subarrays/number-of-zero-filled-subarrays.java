class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int zero = 0;
        long result = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                zero++;
            }else{
                result = result + ((long) zero*(zero+1))/2;
                zero = 0;
            }
        }
        result = result + ((long) zero*(zero+1))/2;
        return result;
    }
}