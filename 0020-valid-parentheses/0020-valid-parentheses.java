class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;

                if(ch == ')' && stack.peek() == '(') stack.pop();

                else if(ch == '}' && stack.peek() == '{') stack.pop();

                else if(ch == ']' && stack.peek() == '[') stack.pop();

                else return false;
            }
        }
        return stack.isEmpty();
    }
}