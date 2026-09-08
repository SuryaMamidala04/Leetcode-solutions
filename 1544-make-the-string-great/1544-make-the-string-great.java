class Solution {
    public String makeGood(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for(char ch : s.toCharArray()){
            if((!stack.isEmpty()) && 
            (ch == Character.toLowerCase(ch) && 
            stack.peek() == Character.toUpperCase(ch)) ){
                stack.pop();
            }
            else if((!stack.isEmpty()) && (ch == Character.toUpperCase(ch) && 
            stack.peek() == Character.toLowerCase(ch))){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
         StringBuilder sb = new StringBuilder();
            for(char ch : stack){
                sb.append(ch);
            }
            sb.reverse();
            return sb.toString();
    }
}