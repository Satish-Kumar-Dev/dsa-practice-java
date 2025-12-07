/**
 * Count Negative Numbers in a Sorted Matrix
 */
class Solution {
    public int countNegatives(int[][] grid) {
        /**
         *  For this solution we need to start from end of row and starting
         *  of the column because
         *  If in a particular row starting col is negative
         *  we don't need to check the later elements because they are
         *  always smaller than this So we can count the columns
         *  So if we found negative value we will move to the next top row
         **/
        int rows = grid.length;
        int cols = grid[0].length;
        int row = rows-1;
        int col = 0;
        int count = 0;
        /**
         *  So row starts with the end and column starts with 0
         */
        while(row >= 0 && col < cols){
            /**
             *  If we found a negative value then counting and moving
             *  to Up*/
            if(grid[row][col] < 0){
                count+= (cols- col);
                row--;
            }
            /**
             *  Else moving right */
            else {
                col++;
            }

        }
        return count;
    }
}