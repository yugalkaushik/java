class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
        StringBuilder curr = new StringBuilder();
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if (curr.length() > 0) {
                    result.append(curr);
                    result.append(' ');
                    curr = new StringBuilder();
                }
                continue;
            }
            curr.insert(0,s.charAt(i));
        }
        if (curr.length() > 0) {
            result.append(curr);
        }
        return result.toString().trim();
    }
}