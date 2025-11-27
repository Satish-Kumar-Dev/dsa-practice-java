class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            /**
             * Check which side you are in means:
             * If your arr[mid] is smaller than its next number we are in the Ascending Side
             * Then we need to move the start to mid + 1 --> Becasuse we already checked the mid value
             */
            /
            if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            }
            /**
             * Else we are in the Descending side then we need to move
             * the end to the mid
             * Because we don't that arr[mid] might or not be the peak so,
             * we are reserving the mid index to check for the next
             */
            /
            else {
                end = mid;
            }
        }
        /**
        * At last start and end both will be at the same point then we can return
         * any of the values
        */
        return start;
    }
}