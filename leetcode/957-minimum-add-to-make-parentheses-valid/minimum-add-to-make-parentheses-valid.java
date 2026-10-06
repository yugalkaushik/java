class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int count = 0;
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if(c=='('){
                stack.push(c);
            }else if(!stack.isEmpty() && c==')'){
                stack.pop();
            }else{
                count++;
            }
        }
        count += stack.size();
        return count;
    }
}