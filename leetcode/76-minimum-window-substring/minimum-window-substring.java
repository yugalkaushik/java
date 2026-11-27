class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> sMap = new HashMap<>();
        HashMap<Character,Integer> tMap = new HashMap<>();
        for(char c:t.toCharArray()){
            tMap.put(c,tMap.getOrDefault(c, 0) + 1);
        }
        for(char c:t.toCharArray()){
            sMap.putIfAbsent(c,0);
        }
        int need = tMap.size();
        int have = 0;
        String result = "";
        int minL = Integer.MAX_VALUE;
        int l = 0;
        for(int r=0;r<s.length();r++){
            char curr = s.charAt(r);
            if (sMap.containsKey(curr)) {
                sMap.put(curr, sMap.get(curr) + 1);
                if(sMap.get(curr).equals(tMap.get(curr))){
                    have++;
                }
            }
            while(have == need){
                if(r - l + 1 < minL){
                    minL = r - l + 1;
                    result = s.substring(l,r+1);
                }
                char temp = s.charAt(l);
                if (sMap.containsKey(temp)) {
                    sMap.put(temp, sMap.get(temp) - 1);
                    if(sMap.get(temp) < tMap.get(temp)){
                        have--;
                    }
                }
                l++;
            }
        }
        return result;
    }
}