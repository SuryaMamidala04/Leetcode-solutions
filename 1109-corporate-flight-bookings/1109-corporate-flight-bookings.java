class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n+1];

        for(int[] arr:bookings){
            ans[arr[0]-1] += arr[2];

            ans[arr[1]] += arr[2]*-1; 
        }
        
        // int a[] = new int[]
        for(int i=1; i<n; i++){
            ans[i] += ans[i-1];
        }

        return Arrays.copyOfRange(ans, 0, n);
    }
}