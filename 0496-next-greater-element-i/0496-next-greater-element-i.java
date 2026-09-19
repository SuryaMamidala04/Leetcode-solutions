class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     HashMap<Integer,Integer> map = new HashMap<>();
     ArrayDeque<Integer> stack = new ArrayDeque<>();
     for(int i : nums2){
        if(stack.isEmpty()){
            stack.push(i);
        }else{
        while(!stack.isEmpty() && stack.peek()<i){
            map.put(stack.pop(),i);
        }
        stack.push(i);
        }
     }
     System.out.println(map);
     int[] ans = new int[nums1.length];
     Arrays.fill(ans,-1);
     for(int i=0; i<nums1.length; i++){
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getKey().equals(nums1[i])){
                ans[i] = entry.getValue();
            }
        }
        // ans[i] = -1;
     }
    //  return new int[nums1.length];  
    return ans;
    }
}