class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = Integer.MAX_VALUE;

        for(String s:strs){
            if(s.length()<len){
                len = s.length();
            }
        }

        int index = 0;
        String result = "";

        while(index<len){
            char c = strs[0].charAt(index);
            for(String s:strs){
                if(c != s.charAt(index)){
                    return result;
                }
            }
            result += c;
            index++;
        }
        return result;
    }
}