class Solution {
    public int pivotIndex(int[] nums) {
        int tsum = 0;
        int lsum = 0;
        for(int i : nums){
            tsum += i;
        }

        for(int i=0; i<nums.length; i++){
            // lsum += nums[i];

            if(lsum*2 == tsum-nums[i]){
                return i;
            }

            lsum += nums[i];
        }
        return -1;
    }
}