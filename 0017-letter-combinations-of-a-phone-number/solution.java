class Solution {
    public List<String> letterCombinations(String digits) {
        return solve("",digits);
    }
    static List<String> solve(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

         List<String> ans = new ArrayList<>();

        int digit = up.charAt(0)-'0';

        int start = (digit-2)*3;
        start += (digit>7) ?1 : 0;
        int end = start + (digit==7 || digit==9? 4 : 3);
        for(int i=start; i<end; i++){
            char ch = (char) ('a'+i);
            ans.addAll(solve(p+ch,up.substring(1)));

        }
        return ans;
    }
}
