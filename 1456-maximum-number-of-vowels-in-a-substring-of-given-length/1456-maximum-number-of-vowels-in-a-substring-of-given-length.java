class Solution {
    public int maxVowels(String s, int k) {
        return solve(s,k);
    }
    static int solve(String s, int k){
        List<Character> list = new ArrayList<>();
        list.addAll(List.of('a','e','i','o','u'));
        // System.out.println(list);
        int v = 0;
        for(int i=0; i<k; i++){
            if(list.contains(s.charAt(i))){
                v++;
            }
        }
        int pv = v;
        for(int i=k; i<s.length(); i++){
            if(list.contains(s.charAt(i))) v++;
            if(list.contains(s.charAt(i-k))) v--;

            pv = Math.max(pv,v);
        }
        return pv>v?pv:v;
    }
}