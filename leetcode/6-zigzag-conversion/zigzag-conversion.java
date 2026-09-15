class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        String[] result = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            result[i] = "";
        }
        int index = 0;
        boolean movingDown = true;
        for(int i=0;i<s.length();i++){
            result[index] += s.charAt(i);
            if(index==numRows-1){
                movingDown = false;
            }
            if(index==0){
                movingDown = true;
            }
            if(movingDown){
                index++;
            }else{
                index--;
            }
        }
        String r = "";
        for(String t:result){
            r = r.concat(t);
        }
        return r;
    }
}