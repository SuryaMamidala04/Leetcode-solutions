class Solution {
    public int maxFreqSum(String s) {
        List<Character> list = new ArrayList<>();
        list.addAll(List.of('a','e','i','o','u'));
        int[] frq = new int[26];
        int maxvowel = 0;
        int maxcon = 0;
        for(char ch : s.toCharArray()){
            int i = ch-'a';
            frq[i]++;
            if(list.contains(ch)){
                maxvowel = Math.max(maxvowel,frq[i]);
            }
            else{
                maxcon = Math.max(maxcon,frq[i]);
            }
        }
        return maxvowel+maxcon;
        
    }
}
