class Solution {
    public int maxProfit(int[] prices) {
        int d = 0;
        int buy = prices[0];
        for(int i=1; i<prices.length; i++){
            if(buy>prices[i]){
                buy = prices[i];
            }
            d =  Math.max(d,prices[i]-buy);
        }
        return d;
    }
}
