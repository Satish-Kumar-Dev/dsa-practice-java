class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(rows == 1) return binarySearch(matrix,0, cols-1,0,target);
        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;
        /**
         *  We need to start eliminating the rows
         *  Which means if we take a middle col and middle row element
         *  If that element is less than the target then we can say that
         *  The elemnts before it are smaller then the target
         *  or if it is greater vice versa
         */
        while(rStart < rEnd-1){
            int mid = rStart + (rEnd - rStart)/2;
            if(matrix[mid][cMid] == target) return true;
            else if(matrix[mid][cMid] < target) rStart = mid;
            else rEnd = mid;
        }
        /**
         * Check if one of the cMid elements is a target */
        if(matrix[rStart][cMid] == target) return true;
        if(matrix[rStart+1][cMid] == target) return true;
        /**
         *  If not check for remainig 4 halfs  */
        /**
         *  The first will be target less than or Equal to rowstart cMid-1*/
        if((cMid > 0) && target <= matrix[rStart][cMid-1] ) return binarySearch(matrix,0,cMid-1,rStart,target);
        /**
         *  The Second will be target Greater than Equal to the rStrat cMid + 1
         and less than cols -1 */
        if(cMid+1<cols && cMid>0 && target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1]) return binarySearch(matrix,cMid+1,cols-1,rStart,target);
        /**
         *  The Third will be target less than the rStrat+1 cMid-1  */
        if(cMid>0 &&target <= matrix[rStart+1][cMid-1]) return binarySearch(matrix,0,cMid-1,rStart+1,target);
        else
            return binarySearch(matrix,cMid+1,cols-1,rStart+1,target);
    }
    /**
     * This method is used to use binary search in a given row for
     *  given column range
     *  Because in anyway rows will be sorted at the start we only
     *  comes to this function after we left with only 2 rows
     *  Nothing complex it's simple binary search if we can see it clearly*/
    boolean binarySearch(int matrix[][], int cStart, int cEnd, int row, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid] == target) return true;
            else if(matrix[row][mid] < target) cStart = mid+1;
            else cEnd = mid-1;
        }
        return false;

    }
}