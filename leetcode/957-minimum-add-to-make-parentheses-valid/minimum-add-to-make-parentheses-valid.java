class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if(c=='('){
                open++;
            }else if(open>0){
                open--;
            }else{
                count++;
            }
        }
        count += open;
        return count;
    }
}