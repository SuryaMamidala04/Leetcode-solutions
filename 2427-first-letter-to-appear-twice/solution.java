class Solution {
    public char repeatedCharacter(String s) {
        // List<Character> list = new ArrayList<>();
        // for(char ch : s.toCharArray()){
        //     if(list.contains(ch)){
        //         list.add(ch);
        //         break;
        //     }
        //     list.add(ch);
        // }
        // return list.get(list.size()-1);
        boolean[] frq = new boolean[26];
        for(char ch : s.toCharArray()){
            if(frq[ch-'a']){
                return ch;
            }
            frq[ch-'a'] = true;
        }
        return ' ';
    }
}
