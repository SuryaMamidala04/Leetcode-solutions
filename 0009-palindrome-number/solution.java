class Solution {
    public boolean isPalindrome(int x) {
        int a = x;
        int z = 0;
        while(a>0){
            int r = a%10;
            z = (z*10)+r;
            a = a/10;
        }
        if(x==z) return true;
        return false;
    }
}
