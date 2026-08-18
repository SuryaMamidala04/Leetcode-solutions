class Solution {
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }
    static boolean solve(char[][] board, int row, int col){
        if(row==board.length){
            return true;
        }

        int nextrow = 0;
        int nextcol = 0;

        if(col == board[0].length-1){
            nextrow = row+1;
            nextcol = 0;
        }else{
            nextrow = row;
            nextcol = col+1;
        }

        if(board[row][col] != '.'){
            return solve(board,nextrow,nextcol);
        }
       
        for(char ch='1'; ch<='9'; ch++){
            if(isSafe(board,row,col,ch)){
                board[row][col] = ch;
                if(solve(board,nextrow, nextcol)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }
    static boolean isSafe(char[][] board,int r, int c, char ch){
        int sq = (int)Math.sqrt(board.length);

        for(int i=0; i<board.length; i++){
            if(board[r][i] == ch){
                return false;
            }
            if(board[i][c] == ch){
                return false;
            }

           
            if(board[sq * (r/sq) + i/sq][sq * (c/sq) + i%sq] == ch){
                return false;
            }
        }
        return true;
    }
}
