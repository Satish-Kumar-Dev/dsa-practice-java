class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            /**
             * We need to check for the missing count
             * For that if we subtract arr[mid]-mid+1 we can get that count
             */
            int missingCount = arr[mid] - (mid + 1);
            /**
             * If the missing count is greater than the k we'll
             move start to mid+1
             else end to mid-1
             */
            if(missingCount < k) start = mid+1;
            else end = mid-1;
        }
        /**
         * Finally start will be at the correct number or index
         from that we'll
         add the k to it */
        return start + k;
    }
}