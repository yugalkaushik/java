class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        int l = 0;
        int count = 0;
        int maxC = 0;
        for(int r=0;r<n;r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                count--;
                l++;
            }
            set.add(s.charAt(r));
            count++;
            maxC = Math.max(maxC,count);
        }
        return maxC;
    }
}