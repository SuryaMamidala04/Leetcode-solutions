class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int pcount = 0;
        for(int i:nums){
            if(i==1){
                count++;
            }
            else{
                if(pcount<count) pcount = count;
                count = 0;
            }
        }
        return count>pcount?count:pcount;
    }
}
