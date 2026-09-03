class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length()) return new ArrayList<>();
        return solve(s,p);
    }
    static List<Integer> solve(String s, String p){
        List<Integer> ans = new ArrayList<>();
       
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(char ch: p.toCharArray()){
            arr1[ch-'a']++;
        }
        // System.out.println(ac);
        // for(int i=0; i<=s.length()-p.length(); i++){
          
        //     for(int j=i; j<i+p.length(); j++){
        //         arr2[s.charAt(j)-'a']++;
        //     }
        //     if(Arrays.equals(arr1,arr2)){
        //         ans.add(i);
        //     }
        //     Arrays.fill(arr2,0);
        // }
        for(int i=0; i<p.length(); i++){
            arr2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr1,arr2)){
            ans.add(0);
        }

        for(int i=p.length(); i<s.length(); i++){
            arr2[s.charAt(i)-'a']++;
            arr2[(s.charAt(i-p.length())-'a')]--;
            if(Arrays.equals(arr1,arr2)){
                ans.add(i-p.length()+1);
            }
        }



        return ans;
    }
}