class Solution {
    public int maxPower(String s) {
        int cl = 1;
        int pl = 0;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1)==s.charAt(i)){
                cl++;
            }
            else{
                if(cl>pl) pl = cl;
                cl = 1;
            }
        }
        return cl>pl?cl:pl;
    }
}