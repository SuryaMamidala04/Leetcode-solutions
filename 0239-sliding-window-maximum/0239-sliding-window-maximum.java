class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int[] ans = new int[nums.length-k+1];
        for(int i=0; i<k; i++){
            while(!queue.isEmpty() && nums[i]>nums[queue.peekLast()]){
                queue.pollLast();
            }
            queue.offerLast(i);
        }
        System.out.println(queue);
        ans[0] = nums[queue.peekFirst()];
        int index = 1;
        for(int i=k; i<nums.length; i++){
            if(queue.peekFirst() == i-k){
                queue.pollFirst();
            }
             while(!queue.isEmpty() && nums[i]>nums[queue.peekLast()]){
                queue.pollLast();
            }
            queue.offerLast(i);
            ans[index++] = nums[queue.peekFirst()];
        }
        System.out.println(queue);
        return ans;
    }
}