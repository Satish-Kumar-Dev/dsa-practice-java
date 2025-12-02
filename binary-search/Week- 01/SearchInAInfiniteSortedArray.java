public class GfG {

    /**
     * Binary search function to find the element in a given range
     * 
    */ 
    public int binarySearch(int arr, int target){
    int start = 0;
    int end = 1;
        /***
         * As the length could not be used for this problem we need to use 
         * Reverse Binary search for this problem.
         * Start = 0 and end = 1 will help us to start the problem statement
         * Starting a while loop where arr[end] < target
         */
        /
    while(arr[end] < target){
        int temp = end + 1;
        /**
         * If still the arr[end] is less than the target Every time 
         * We double the Searching range space untli arr[end]>= target
         * Everytime we need to update the start and end variables
         * to get the specific range that target exists
         */
        /
        end = end + (end - start +1)*2;
        start = temp;
    }
    /**
     * So at one point it will get out of the loop and gives us the range of indices
     * that we need to search for the target value
     * */
    return search(start,end,arr,target);
    }
    search(int start, int end, int arr, int target){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) end = mid-1;
            else start = mid + 1;
        }
        return -1;
    }
}