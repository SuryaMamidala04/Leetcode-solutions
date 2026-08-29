class Solution {
    public String reverseOnlyLetters(String s) {
        return solve(s);
    }
    String solve(String s){
        char[] arr = s.toCharArray();
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            while(l<r && !isAlp(arr[l])){
                l++;
            }
            while(l<r && !isAlp(arr[r])){
                r--;
            }
            if(l<r){
                char ch = arr[l];
                arr[l] = arr[r];
                arr[r] = ch;
                l++;
                r--;
            }
        }
        return new String(arr);
    }
    boolean isAlp(char ch){
        int ac = ch;
        if((ac>=65 && ac<=90) || (ac>=97 && ac<=122)){
            return true;
        }
        return false;
    }
}
