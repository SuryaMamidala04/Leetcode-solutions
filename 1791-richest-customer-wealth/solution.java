class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] nums: accounts){
            int total = Arrays.stream(nums).sum();
            if(total>max){
                max = total;
            }
        }
        return max;
    }
}
