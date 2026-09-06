class Solution {
    public int reverse(int x) {
        boolean isNeg = false;
        if(x<0){
            x = -(x);
            isNeg = true;
        }
        int result = 0;
        if(x == 0) return result;
        while(x!=0){
            int n = x % 10;
            if(result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) return 0;
            result = result * 10 + n;
            x = x/10;
        }
        if(isNeg){
            result = -(result);
            return result;
        } else return result;
    }
}