class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = {-1,-1};
        ans[0] = search(nums,target,true);
        if(ans[0]!=-1) ans[1] = search(nums,target,false);
        return ans;
    }
    int search(int[] arr,int target, boolean isFirstIndex ){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            /**
            * The common conditions are whether the middle element is greater or lesser
             * than the target.
            * */
            int mid = start + (end-start)/2;
            if(arr[mid] < target) start = mid+1;
            else if(arr[mid] > target) end = mid-1;
            /**
             * If middle element equals target then we need to know whether
             * we are searching for the 1st index of the target or the 2nd index of the target
             * So boolena isFirstIndex helps us to know that and
             * If it is searching for the 1st index then we need to make end = mid - 1
             * else we need to make start = mid + 1
             * */
            else{
                ans = mid;
                if(isFirstIndex) end = mid-1;
                else start = mid+1;
            }
        }
        return ans;
    }
}