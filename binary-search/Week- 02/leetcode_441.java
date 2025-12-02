/**
 * Arranging Coins
 * */
class Solution {
    public int arrangeCoins(int n) {
        if(n < 2) return n;
        return binarySearch(1,n,n);
    }
    int binarySearch(int start,int end, int limit){
        while(start <= end){
            int mid = start + (end - start)/2;
            /**
             * To solve this Sum we need to understand this formula
             * So this is used to give the exact exact number or rows
             * That we can get to create for the given condition
             */
            long max = (long)((mid * (mid+1))/2);
            if(limit == mid) return mid;
            else if(max < limit) start = mid+1;
            else end = mid-1;
        }
        return end;
    }
}