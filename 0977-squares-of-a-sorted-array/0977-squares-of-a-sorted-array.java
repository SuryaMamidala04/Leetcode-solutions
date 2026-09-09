class Solution {
    public int[] sortedSquares(int[] nums) {
        // for(int i=0; i<nums.length; i++){
        //     nums[i] = nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;
        int[] ans = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        for(int p=nums.length-1; p>=0; p--){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                ans[p] = nums[left]*nums[left];
                left++;
            }
            else{
                ans[p] = nums[right]*nums[right];
                right--;
            }
        }
        return ans;
    }
}