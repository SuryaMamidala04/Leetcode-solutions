class Solution {
    public int shipWithinDays(int[] weights, int days) {
        return shipCapacity(weights,days);
    }
    static boolean can_lift(int[] weights, int days, int max){
        int w = 0;
        int d = 0;
        for(int i=0; i<weights.length; i++){
            if(w+weights[i]<=max){
                w+=weights[i];
            }
            else{
                w=weights[i];
                d++;
            }
        }
        if(w!=0){
            d++;
        }
        return d<=days;
    }

    static int low(int[] weights){
        int l = 0;
        for(int i:weights){
            if(i>l){
                l = i;
            }
        }
        return l;
    }

    static int high(int[] weights){
        int sum = 0;
        for(int i:weights){
            sum += i;
        }
        return sum;
    }

    static int shipCapacity(int[] weights, int days){
        int low = low(weights);
        int high = high(weights);

        while(low<high){
            int max = low + (high-low)/2;

            if(can_lift(weights,days,max)){
                high = max;
            }
            else{
                low = max+1;
            }
        }
        return low;
    }
}