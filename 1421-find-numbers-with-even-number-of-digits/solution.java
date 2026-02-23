class Solution {
    public int findNumbers(int[] nums) {
        int c =0;
        for(int num: nums){
            int i = 0;
            while(num>0){
                i++;
                num = num/10;
            }
            if(i%2==0){
                c++;
            }
        }
        return c;
    }
}
