class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        /**
        * First of all check for the peak index
         * So that we can know that left side of the peak index will be in the
         * Ascending order and right will be in the Descending order
         */
        int peak = peakIndex(arr);
        int ans = -1;
        if(arr.get(peak) == target ) return peak;
        /**
         * Check for the one side of the peak index
         * If target is found then we can return the index
         */
        ans = binarySearch(0, peak, arr,target, true);
        if(ans == -1){
            /**
             * If not found we can check in the other part of the array
             */
            return binarySearch(peak, arr.length()-1, arr,target, false);
        }
        return ans;
    }
    int peakIndex(MountainArray arr) {
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
    int binarySearch(int start, int end, MountainArray arr, int target, boolean isAsc){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr.get(mid) == target){
                return mid;
            }
            else if(arr.get(mid) < target){
                if(isAsc){
                    start = mid+1;
                }
                else end = mid-1;
            }
            else {
                if(isAsc){
                    end = mid-1;
                }
                else start = mid+1;
            }
        }
        return -1;
    }
}