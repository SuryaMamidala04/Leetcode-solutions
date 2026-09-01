class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      return minEat(piles,h);
    }
    static boolean canEat(int[] piles,int h,int k){
          long hours = 0;
            for(int i=0; i<piles.length; i++){
                // hours += (int)Math.ceil(1f*piles[i]/k);
                hours += (piles[i]+k-1)/k;
            }
            
            return hours<=h;
    }

    static int getMax(int[] piles){
        int max = 0;
        for(int i=0; i<piles.length; i++){
            max=Math.max(max,piles[i]);
        }
        return max;
    }

    static int minEat(int[] piles, int h){
        int low = 1;
        int high = getMax(piles);


       while(low<high){
         int k = low+(high-low)/2;

        if(canEat(piles,h,k)){
            high = k;
        }
        else{
            low = k+1;
        }
       }
        return low;
    }
}