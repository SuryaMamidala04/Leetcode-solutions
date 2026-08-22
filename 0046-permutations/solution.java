class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans,new ArrayList<>(),nums);
         return ans;
    }
    // static void solve(List<List<Integer>> ans,String p, int[] arr, int index){
    //     if(index==arr.length){
    //         List<Integer> list = new ArrayList<>();
    //         for(char ch : p.toCharArray()){
    //             int d = ch-'0';
    //              list.add(d);
    //         }
    //         ans.add(list);
    //         return;
    //     }

    //     // List<List<Intger>> ans = new ArrayList<>();
    //     char ch = (char) (arr[index] + '0');

    //     //char ch = Charcter.fordDgit(digit,10);

    //     for(int i=0; i<=p.length(); i++){
    //         String left = p.substring(0,i);
    //         String right = p.substring(i,p.length()); 
    //        solve(ans,left+ch+right,arr,index+1);
    //     }
    //     // return ans;
    // }

    static void backtrack(List<List<Integer>> ans,List<Integer> current, int[] arr){
        if(current.size() == arr.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i=0; i<arr.length; i++){
            if(current.contains(arr[i])) continue;
            current.add(arr[i]);
            backtrack(ans,current,arr);
            current.remove(current.size()-1);
        }
    }

}
