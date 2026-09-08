class Solution {
    public String removeDuplicates(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
       for(char ch : stack){
        sb.append(ch);
       }
       System.out.println(sb.reverse());
        return sb.toString();
        
    }
}