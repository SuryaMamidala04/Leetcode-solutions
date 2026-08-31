class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] arr = new int[nums.length];

        int window = 2*k+1;

        long sum = 0;
        Arrays.fill(arr,-1);

        if(nums.length<window){
            return arr;
        }

        for(int i=0; i<nums.length; i++){
            sum += nums[i];

            if(i-window >= 0){
                sum -= nums[i-window];
            }

            if(i >= window-1){
                arr[i-k] = (int)(sum/window);
            }
        }
        return arr;
    }
}
