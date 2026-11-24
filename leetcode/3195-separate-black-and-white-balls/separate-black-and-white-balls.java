class Solution {
    public long minimumSteps(String s) {
        long count = 0;
        long steps = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }else{
                steps += count;
            }
        }
        return steps;
    }
}