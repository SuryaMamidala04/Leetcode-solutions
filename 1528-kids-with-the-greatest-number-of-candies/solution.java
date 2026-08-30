class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int l =0;
        for(int i=0; i<candies.length; i++){
            if(candies[i]>=l){
                l = candies[i];
            }
        }
        for(int i=0; i<candies.length; i++){
            if(candies[i]+extraCandies >= l){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}
