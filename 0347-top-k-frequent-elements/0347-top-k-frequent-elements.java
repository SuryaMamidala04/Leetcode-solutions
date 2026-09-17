import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
           map.put(num, map.getOrDefault(num,0)+1);
        }
        List<Integer> list = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            list.add(entry.getValue());
        }
        Collections.sort(list);

        int index = list.size()-1;
        int[] ans = new int[k];
        for(int i=0; i<k; i++){
          for(Map.Entry<Integer,Integer> entry : map.entrySet()){
             if(entry.getValue().equals(list.get(index))){
                ans[i] = entry.getKey();
                index--;
                map.remove(entry.getKey());
                break;
             }
        }   
        } 
        return ans;

    }
}