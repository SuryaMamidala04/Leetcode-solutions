class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        ArrayList<Character> list = new ArrayList<>();
        for(char ch : s.toCharArray()){
            while(list.contains(ch)){
                list.remove(0);
            }
            list.add(ch);
             l = Math.max(l,list.size());
        }

        return l;
        // int ml = l;
        // for(int i=l; i<s.length(); i++){
        //     if(list.contains(ch)){
        //         ml = Math.max()
        //     }
        // }
        // System.out.println(list);
        // return 0;
    }
}