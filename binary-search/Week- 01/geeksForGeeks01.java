public class GfG {

    // Binary search function to find the element
    // in a given range
    public int binarySearch(int arr, int target){
    int start = 0;
    int end = 1;
    while(arr[end] < target){
        int temp = end + 1;
        end = end + (end - start +1)*2;
        start = temp;
    }
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