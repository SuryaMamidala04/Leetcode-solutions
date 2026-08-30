class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int oc = 0;
        for(int i:arr){
            if((i&1)==1){
                oc++;
                if(oc>=3) return true;
            }
            else{
                oc = 0;
            }
        }
        return false;
    }
}