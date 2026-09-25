class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int maxC = Integer.MIN_VALUE;
        while(left<right){
            int minH = Math.min(height[left],height[right]);
            int capacity = minH * (right - left);
            maxC = Math.max(maxC,capacity);
            if(height[left]>=height[right]){
                right--;
            }else left++;
        }
        return maxC;
    }
}