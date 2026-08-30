class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> winmap = new HashMap<>();
        Map<Integer, Integer> lossmap = new HashMap<>();

        for(int[] match : matches){
            int win = match[0];
            int loss = match[1];

            winmap.put(win,winmap.getOrDefault(win,0)+1);
            lossmap.put(loss,lossmap.getOrDefault(loss,0)+1); 
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int player : winmap.keySet()){
            if(!lossmap.containsKey(player)){
                list1.add(player);
            }
        }

        for(Map.Entry<Integer, Integer> loose: lossmap.entrySet()){
            if(loose.getValue() == 1){
                list2.add(loose.getKey());
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);

        // List<List<Integer,Integer>> ans = new ArrayList<>();
        // ans.add(list1);
        // ans.add(list2);
        return List.of(list1,list2);

    }
}
