class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length<=2) return true;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]<=nums[i+1]){
                if(i==nums.length-2)
                    return true;
            }
            else{
                break;
            }
        }
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>=nums[i+1]){
                if(i==nums.length-2)
                    return true;
            }
            else{
                break;
            }
        }
        return false;
    }
}
