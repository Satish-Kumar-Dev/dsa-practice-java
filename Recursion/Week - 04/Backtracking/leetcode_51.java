// N-Queens
class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][]  used= new boolean[n][n];
        List<List<String>> result = new ArrayList<>();
        backtrack(used,result,0);
        return result;
    }
    void backtrack(boolean[][] used,List<List<String>> result,int row){
        if(row == used.length){
            display(used,result);
            return;
        }
        for(int col = 0; col < used.length; col++){
            if(isSafe(used,row,col)){
                used[row][col] = true;
                backtrack(used,result,row+1);
                used[row][col] = false;
            }
        }
    }
    void display(boolean[][] used,List<List<String>> result){
        List<String> list = new ArrayList<>();
        for(boolean[] row: used){
            String str = "";
            for(boolean element: row){
                if(element)
                    str+="Q";
                else str+=".";
            }
            list.add(str);

        }
        result.add(list);
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