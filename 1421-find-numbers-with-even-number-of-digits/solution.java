class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        for(int num : nums){
            c += solve(num);
        }
        return c;
    }
    static int solve(int num){
        int count = 0;
        while(num>0){
            count++;
            num /= 10;
        }
        if(count%2==0){
            return 1;
        }
        return 0;
    }
}
