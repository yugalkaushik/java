class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int[] result = new int[n-k+1];
        for(int r=k-1;r<n;r++){
            for(int i=l;i<r;i++){
                if(nums[i+1]-1 != nums[i]){
                    result[l] = -1;
                }
            }
            if(result[l] != -1){
                result[l] = nums[r];
            }
            l++;
        }
        return result;
    }
}