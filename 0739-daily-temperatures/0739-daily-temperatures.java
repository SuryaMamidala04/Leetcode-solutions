class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        int[] ans = new int[temperatures.length];
        for(int i=0; i<ans.length; i++){
            if(stack.isEmpty()){
                stack.push(i);
            }
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                ans[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        // System.out.println(ans.toString);
        return ans;
    }
}