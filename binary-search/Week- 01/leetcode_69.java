class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        if(x < 4) return 1;
        int start = 1;
        int end = x;
        while(start < end -1){
            int mid = start + (end - start)/2;
            long square = (long) mid * mid;
            if(square == x) return mid;
            else if(square < x) start = mid;
            else end = mid;
        }
        return start;
    }
}