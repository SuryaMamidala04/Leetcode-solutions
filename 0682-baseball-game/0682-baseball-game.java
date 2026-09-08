class Solution {
    public int calPoints(String[] operations) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int sum = 0;
        for(String ch : operations){
            if(ch.equals("C")){
                stack.pop();
            }
            else if(ch.equals("D")){
                int a = stack.peek();
                stack.push(2*a);
            }
            else if(ch.equals("+")){
                int top1 = stack.pop();
                int top2 = stack.peek();
                stack.push(top1);
                stack.push(top1+top2);
            }
            else{
                stack.push(Integer.parseInt(ch));
            }
        }
        for(int i : stack){
            sum += i;
        }
        return sum;
    }
}