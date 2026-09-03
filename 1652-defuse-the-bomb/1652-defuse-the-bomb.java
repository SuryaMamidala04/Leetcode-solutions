class Solution {
    public int[] decrypt(int[] code, int k) {
        return solve(code,k);
    }
    static int[] solve(int[] code, int k){
       int[] result = new int[code.length];
       if(k==0) return result;
       int start = 0;
       int end = 0;
       if(k>0){
        start = 1;
        end = k;
       }
       if(k<0){
        start = code.length-Math.abs(k);
        end = code.length-1;
       }
       int sum = 0;
       for(int i=start; i<=end; i++){
        sum += code[i];
       }
       result[0] = sum;
       for(int i=1; i<code.length; i++){
        sum -= code[start%code.length];
        start++;
        end++;
        sum += code[end%code.length];
        result[i] = sum;
       }
       return result;
    }
}