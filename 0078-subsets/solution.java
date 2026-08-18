class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        return solve(new ArrayList<>(),new ArrayList<>(), nums, 0);
    }
    // static List<List<Integer>> solve(int[] arr){
    //    List<List<Integer>> outer = new ArrayList<>();
    //    outer.add(new ArrayList<>());
    //    for(int num:arr){
    //     int n = outer.size();
    //     for(int i=0; i<n; i++){
    //         List<Integer> internal = new ArrayList<>(outer.get(i));
    //         internal.add(num);
    //         outer.add(internal);
    //     }
    //    }
    //    return outer;
    // }

     static List<List<Integer>> solve(List<List<Integer>> result,List<Integer> temp ,int[] arr, int index){
       result.add(new ArrayList<>(temp));
      for(int i=index; i<arr.length; i++){
        temp.add(arr[i]);
        solve(result,temp,arr,i+1);
        temp.remove(temp.size()-1);
      }
       return result;
    } 
}
