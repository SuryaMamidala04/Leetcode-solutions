class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int max = 0;
        int streak = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        for(int i : set){
            streak = 0;
            if(!set.contains(i-1)){
                // streak++;
                int e = i;
                while(true){
                    if(set.contains(e)){
                        streak++;
                        e++;
                    }
                    else{
                        break;
                    }
                }
            }
            max = Math.max(max,streak);
        }
        System.out.println(max);
        return max;
    }
}