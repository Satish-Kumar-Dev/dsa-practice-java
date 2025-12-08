class Solution {
    /**
     *  Fibonacci Using Recursion */
    public int fib(int n) {
        /** Base Condition*/
        if(n < 2) return n;
        return fib(n-1) + fib(n-2);
    }
}