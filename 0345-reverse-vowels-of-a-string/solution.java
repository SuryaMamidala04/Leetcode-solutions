class Solution {
    public String reverseVowels(String s) {
        List<Character> list = new ArrayList<>();
        list.addAll(List.of('A','E','I','O','U','a','e','i','o','u'));
        int l = 0;
        int r = s.length()-1;
        char[] arr = s.toCharArray();
        int i = 0;
        while(l<r){
            while(l<r && !list.contains(arr[l])){
                l++;
            }
            while( l<r && !list.contains(arr[r])){
                r--;
            }
            if(l<r){
               char ch = arr[l];
               arr[l] = arr[r];
               arr[r] = ch;
               l++;
               r--;
            }

        }
        return new String(arr);
    }
}
