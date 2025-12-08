//Number of Steps to Reduce a Number to Zero
class Solution {
    /**
     * This Solution is made suing Recursion
     */
    public int numberOfSteps(int num) {
        return helper(num,0);
    }
    int helper(int num,int count){
        /**
         * According to the given conditions
         * If the n is even judt divide it by 2
         * or subtract the number with 1
         * Base condition will be if num ==0 return the count which is passed in the index*/
        if(num == 0) return count;
        count++;
        if(num % 2 == 0) return helper(num/2,count);
        return helper(--num,count);
    }
}