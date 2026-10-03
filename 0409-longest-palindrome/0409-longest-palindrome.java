class Solution {
    public int longestPalindrome(String s) {
        Set<Character> map = new HashSet<>();
        int l = 0;
        for(char c : s.toCharArray()){
            if(map.contains(c)){
                map.remove(c);
                l += 2;
            }
            else{
                map.add(c);
            }
        }
        if(!map.isEmpty()){
            l += 1;
        }
        return l;
    }
}