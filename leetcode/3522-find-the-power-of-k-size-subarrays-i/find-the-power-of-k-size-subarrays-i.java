class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int r = k - 1;
        int l = 0;
        int n = nums.length;
        int[] result = new int[n-k+1];
        while(r<n){
            for(int i=l+1;i<=r;i++){
                if(nums[i] - 1 != nums[i-1]){
                    result[l] = -1;
                }
            }
            if(result[l] != -1){
                result[l] = nums[r];
            }
            r++;
            l++;
        }
        return result;
    }
}