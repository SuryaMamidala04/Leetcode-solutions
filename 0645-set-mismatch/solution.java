class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int i= 0;
        while(i<nums.length){
            int index = nums[i]-1;
            if(nums[i] != nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
            else{
                i++;
            }
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j] != j+1){
                ans[0] = nums[j];
                ans[1] = j+1; 
            }
        }
        return ans;
    }
}
