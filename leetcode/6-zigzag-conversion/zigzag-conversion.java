class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        StringBuilder[] result = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            result[i] = new StringBuilder();
        }
        int index = 0;
        boolean movingDown = true;
        for(int i=0;i<s.length();i++){
            result[index].append(s.charAt(i));
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
        StringBuilder r = new StringBuilder("");
        for(StringBuilder t:result){
            r = r.append(t);
        }
        return r.toString();
    }
}