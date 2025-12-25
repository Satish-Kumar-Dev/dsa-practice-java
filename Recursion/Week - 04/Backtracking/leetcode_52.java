// N-Queens ii
class Solution {
    public int totalNQueens(int n) {
        boolean[][]  used= new boolean[n][n];
        return backtrack(used,0);
    }
    int backtrack(boolean[][] used,int row){
        if(row == used.length){
            return 1;
        }
        int count = 0;
        for(int col = 0; col < used.length; col++){
            if(isSafe(used,row,col)){
                used[row][col] = true;
                count+=backtrack(used,row+1);
                used[row][col] = false;
            }
        }
        return count;
    }
    boolean isSafe(boolean[][] used, int row, int col){
        //Check vertical row
        for(int i=0; i<row; i++){
            if(used[i][col])
                return false;
        }
        //Check left diagnol
        int maxLeft = Math.min(row,col);
        for(int i=1; i<=maxLeft; i++){
            if(used[row-i][col-i])
                return false;
        }
        //Check right diagnol
        int maxRight = Math.min(row,used.length-col-1);
        for(int i=1; i<=maxRight; i++){
            if(used[row-i][col+i])
                return false;
        }
        return true;
    }
}