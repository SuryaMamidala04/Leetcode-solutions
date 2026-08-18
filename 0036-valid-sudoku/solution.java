class Solution {
    public boolean isValidSudoku(char[][] board) {
        return solve(board,0,0);
    }
    static boolean solve(char[][] board,int row, int col){
        if(row == board.length){
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
            return isSafe(board,row,col) && solve(board,nextrow,nextcol);
         }else{
            return solve(board,nextrow,nextcol);
         }
        
    }
    static boolean isSafe(char[][] board, int r, int c){
        int sq = (int)Math.sqrt(board.length);
        for(int i=0; i<board.length; i++){
            if(board[r][i] == board[r][c] && i!=c){
                return false;
            }
            if(board[i][c] == board[r][c] && i!=r){
                return false;
            }
            int cr = sq * (r/sq) + i/sq;
            int cc = sq * (c/sq) + i%sq;
            if(board[cr][cc] == board[r][c] && (cr!=r || cc!=c)){
                return false;
            }
        }
        return true;
    }
}
