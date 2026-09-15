class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        if(t.length()==0) return false;
        
        int index = 0;
        for(int i=0;i<t.length();i++){
            if(index < s.length() && s.charAt(index)==t.charAt(i)){
                index++;
            }
        }
        return index == s.length();
    }
}