class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for(int num:nums1){
            nums.add(num);
        }
        for(int num:nums2){
            if(nums.contains(num)){
                result.add(num);
            }
        }
        int[] answer = new int[result.size()];
        int i = 0;
        for(int num:result){
            answer[i++] = num;
        }
        return answer;
    }
}