//198: House Robber
class Solution {
    public int rob(int[] nums) {
        // Normal Approach
        // int rob1 =0, rob2 = 0;
        // for(int i=0; i<nums.length; i++){
        //     int temp = Math.max(rob1+nums[i], rob2);
        //     rob1 = rob2;
        //     rob2 = temp;
        // }
        // return Math.max(rob1,rob2);
        return rob1(nums,0,0,0);
    }
    //Recursive Approach
    int rob1(int[] nums, int index, int rob1, int rob2){
        if(index > nums.length-1) return Math.max(rob1,rob2);
        int temp = Math.max(rob1+nums[index],rob2);
        rob1 = rob2;
        rob2 = temp;
        return rob1(nums,index+1,rob1,rob2);
    }
}