class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int cl = 1;
        int pl = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]<nums[i]){
                cl++;
            }
            else{
                if(cl>pl) pl = cl;
                cl = 1;
            }
        }
        return cl>pl?cl:pl;
        
    }
}
