class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l = 0;
        int n = s.length();
        int maxS = 0;
        for(int r=0;r<n;r++){
            char c = s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            int maxV = 0;
            for(int val:map.values()){
                maxV = Math.max(maxV,val);
            }
            if((r-l+1) - maxV > k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            maxS = Math.max(maxS, r-l+1);
        }
        return maxS;
    }
}