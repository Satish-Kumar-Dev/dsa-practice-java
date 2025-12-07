class Solution {
    public int search(int[] arr, int target) {
        int pivotIndex = pivot(arr);
        if(pivotIndex == -1){
            /**
             * If the pivot index is not found then the Array is not rotated
             * then we can do normal binary search
             */
            return binarySearch(0, arr.length-1, arr, target);
        }
        /**
         * Return if the Pivot element is equal to the target
         */
        if(arr[pivotIndex] == target) return pivotIndex;
        /**
         * If the start element less than or equal to the target then
         * we need to search from start to the pivot
         * */
        else if(arr[0] <= target) return binarySearch(0, pivotIndex-1, arr, target);
        else return binarySearch(pivotIndex+1, arr.length-1, arr, target);
    }
    /**
     * Finding pivot of an array
     * */
    int pivot(int []arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            /** Check if the middle element is smaller than its
             * Previous element then mid-1 element is our Pivot
             */
            if(mid > start && arr[mid] < arr[mid-1]) return mid-1;
            /** Or else
             *   Check whether the element is greater than the Next Element
             *   Then it will be our Pivot
             */
            else if(mid < end && arr[mid] > arr[mid+1]) return mid;
            /**
            *   If the mid element is Equal to or smaller than the start element
                then we can say that all the elements after the mid wil be
                smaller than the start element so change the end = mid-1  */
            else if(arr[mid] <= arr[start]) end = mid-1;
            /** In last case mid might be greater than the start element
             then we need to check for the next elements of mid so
             start = mid+1 */
            else start = mid+1;
        }
        /**If Pivot not found return -1 */
        return -1;
    }
    int binarySearch(int start, int end, int []arr, int target){
        while(start <= end){
            int mid = start + (end -start)/2;
            /**
             *  check if the mid value is the target
             *  */
            if(arr[mid] == target) return mid;
                /**
                 *  If mid value less than target then start = mid+1
                  */
            else if(arr[mid] < target) start = mid+1;
            /**
             * else mid value greater than target then mid = end-1
             */
            else end = mid-1;
        }
        /**
         * if target not found return -1;
         */
        return -1;
    }
}