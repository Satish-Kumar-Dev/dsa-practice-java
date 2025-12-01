class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int start = 0;
        int end = 0;
        /**
         Need to check the what's the range we are going to search
         So initial start and end with zero
         */
        for(int i=0; i<arr.length;i++){
            /**
             Start will be the max element of the Array of weights Because
             altleast we can send that much amount of wieght in a day
             and the end will be the Sum of all the elements
             */
            start = Math.max(start,arr[i]);
            end+= arr[i];
        }
        while(start < end){
            /**
             Start checking with the middle element
             sum will be the max weight per day we can take on the conveyor belt
             */
            int mid = start +(end-start)/2;
            int sum = 0;
            int count = 1;

            for(int num: arr){
                /**
                 When the weight is increasing by the mid value we need to
                 change the weight to the next day and increase the number
                 of days
                 */
                if(sum+num > mid){
                    sum = num;
                    count++;
                }
                /**
                 else just add the weight on the same day
                 */
                else sum+=num;
            }
            /**
             If count is greater than the given days then we need to increase the weight per day
             */
            if(count > days) start = mid+1;
            /**
             Else we can decrease the weight per day
             */
            else end = mid;
        }
        /**
         Finally start and end points at the same weight
         So we can return any one of them
         */
        return start;
    }
}