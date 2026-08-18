class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        return solve(new ArrayList<>(), new ArrayList<>(),nums,0);
    }
    // static List<List<Integer>> solve(int[] arr){
    //     Arrays.sort(arr);
    //     List<List<Integer>> outer = new ArrayList<>();
    //     outer.add(new ArrayList<>());
    //     int start = 0;
    //     int end = 0;
    //     for(int i=0; i<arr.length; i++){
    //         start = 0;
    //         if(i>0 && arr[i] == arr[i-1]){
    //             start = end+1;
    //         }
    //         end = outer.size()-1;
    //         int n = outer.size();
    //         for(int j=start; j<n; j++){
    //             List<Integer> internal = new ArrayList<>(outer.get(j));
    //             internal.add(arr[i]);
    //             outer.add(internal);
    //         }
    //     }
    //     return outer;
    // }

    static List<List<Integer>> solve(List<List<Integer>> result, List<Integer> temp, int[] arr, int index){
        result.add(new ArrayList<>(temp));
        for(int i=index; i<arr.length; i++){
            if(i>index && arr[i] == arr[i-1]){
                continue;
            }
            temp.add(arr[i]);
            solve(result,temp,arr,i+1);
            temp.remove(temp.size()-1);
        }
        return result;
    }
}
