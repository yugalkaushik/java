class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        if(n<k) return new int[0];
        int l = 0;
        int count = 1;
        int[] result = new int[n-k+1];
        for(int r=0;r<n;r++){
            if(r>0 && nums[r] == nums[r-1]+1){
                count++;
            }
            if(r>=k-1){
                if(count == k){
                    result[l] = nums[r];
                } else{
                    result[l] = -1;
                }
                if(l+1<n && nums[l]==nums[l+1]-1){
                    count--;
                }
                l++;
            }

        }
        return result;
    }
}