class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre = 1;
        int[] res = new int[nums.length];
        // int res[0] = 1;
        for(int i=0; i<nums.length; i++){
            res[i] = pre;
            pre *= nums[i]; 
        }

        int m = 1;
        for(int i=nums.length-1; i>=0; i--){
            res[i] *= m;
            m *= nums[i];
        }
        return res;
    }
}