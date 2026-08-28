class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int ps = 0;
        for(int[] arr:accounts){
            int cs = 0;
            for(int i:arr){
                cs+=i;
            }
            ps =Math.max(cs,ps);
        }
        return ps;
    }
}
