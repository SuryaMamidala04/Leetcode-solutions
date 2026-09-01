class Solution {
    public int maxSubArray(int[] nums) {

        if(nums.length == 0){
            return -1;
        }
        int maxsum = nums[0];
        int cursum = nums[0];


        for(int i=1; i<nums.length; i++){
            cursum = Math.max(cursum+nums[i],nums[i]);

            maxsum = Math.max(cursum,maxsum);

        }

        return maxsum;

    }
}