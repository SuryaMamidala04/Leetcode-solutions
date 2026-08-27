class Solution {
    public boolean is_self(int n){
        if(n<10){
            return true;
        }
        int temp=n;
        boolean flag = true;
        while(temp>0){
            int r = temp%10;
            if(r!=0&&n%r!=0){
                flag = false;
            }
            if(r==0){
                flag = false;
            }
            temp/=10;
        }
        return flag;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i=left; i<=right; i++){
            if(is_self(i)){
                list.add(i);
            }
        }
        return list;
    }
}
