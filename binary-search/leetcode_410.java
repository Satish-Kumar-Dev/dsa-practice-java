class Solution {
    public int splitArray(int[] arr, int k) {
        int start = 0;
        int end = 0;
        /**
         Calculate the Minimum and Maximum Sub array sum that we can divide
         */
        for(int i=0; i<arr.length; i++){
            start = Math.max(start,arr[i]);
            end += arr[i];
        }
        /**
         Starting binary serach on Min and Max
         */
        while(start < end){
            int mid = start +(end - start)/2;
            int parts = 1;
            int sum = 0;
            for(int n:arr){
                /**
                 If sum+element exceeds the Middle then
                 we need to increase the sub arrays parts and
                 Start sum as the present element --> Because we are adding
                 Creating a new Sub Array
                 */
                if(sum+n > mid) {
                    parts++;
                    sum = n;
                }
                /*
                 * Or Just add the element to the sum
                 */
                else sum+=n;
            }
            /**
             If we are getting more number parts than the actual value given
             then we can increase the mid value
             */
            if(parts <= k) end = mid;
            /**
             If the parts are less then the required one then we can
             decrease the mid value
             */
            else start = mid+1;
        }
        /**
         At the end Both start and end stops at the same point so we can return any of it
         */
        return end;
    }
}