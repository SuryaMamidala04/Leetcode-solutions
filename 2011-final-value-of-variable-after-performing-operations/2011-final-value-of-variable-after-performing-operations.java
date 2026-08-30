class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for(String s: operations){
            switch(s){
                case "--X":
                    X -= 1;
                    break;
                case "X--":
                    X -= 1;
                    break;
                case "++X":
                   X += 1;
                   break;
                case "X++":
                   X += 1;
                   break;
                   default:
                     X += 0;
            }
        }
        return X;
        
    }
}