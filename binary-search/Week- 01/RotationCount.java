class RotationCount{
        int calculateCount(int []arr){
            int ans = pivot(arr);
            if(ans == -1){
                return 0
            }
            return ans+1;
        }
    int pivot(int []arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            /**
             We need to chech for 4 cases here
             First 2 are to check whether to take mid or mid-1 equals pivot
             */
            if((mid > start) && arr[mid]<arr[mid-1]) return mid-1;
            else if((mid < end) && arr[mid] > arr[mid+1]) return mid;
            /**If Start and End values are same we can skip them,
             But before skipping them we need to check whether their
             neighbour numbers are Pivot or not

             */
            else if((arr[mid] == arr[start]) && arr[mid]==arr[end]){
                // If starting element greater than its next element then return start
                if(start < end && arr[start] > arr[start+1]) return start;

                start++;
                // If last element is smaller than its previous elements then 2nd element from the last will be pivot
                if(end > start && arr[end] < arr[end-1]) return end-1;
                end--;
            }
            /**
             If any one of these
             1. If start element is smaller than the middle element or
             2. Combination of 2 conditions
             a. start and end elements must be same
             b. middle element must be greater than the last element
             So then we can check for the pivot element after the mid
             */
            else if(arr[start] < arr[mid] || (arr[start] == arr[end] && arr[mid] > arr[end])) start = mid+1;
                // Last condition whille arr[mid] < arr[end] or start equals  end && mid > start
            else end = mid-1;
        }
        return -1;
}