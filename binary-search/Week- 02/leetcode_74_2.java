class Solution {
    //Solution 2 for Leetcode_74 Problem
    public boolean searchMatrix(int[][] matrix, int target) {
        /**
         *  For this Solution we are going to consider 2D Matrix
         *  in 1D array because each row is sorted
         */
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols -1;
        /**
         * Normal Binary Search as going to do for 1D array */
        while(left <= right){
            int mid = left + (right-left)/2;
            /**
             * Extracting mid row with mid/cols and
             * mid column with mid%cols
             * Then Applying Normal Binary Search
             */
            int midValue = matrix[mid/cols][mid%cols];
            if(midValue == target) return true;
            else if(midValue < target) left = mid+1;
            else right = mid-1;
        }
        return false;


    }
}