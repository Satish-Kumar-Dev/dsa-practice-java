/**
 * This is the example for bubble sort
 */

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        return bubbleSort(names,heights,names.length-1,0,0);
    }
    String[] bubbleSort(String[] names, int[] heights,int r, int c){
        if(r==0) return names;
        if(c < r){
            if(heights[c] < heights[c+1]){
                String temp = names[c];
                names[c] = names[c+1];
                names[c+1] = temp;
                int temp1 = heights[c];
                heights[c] = heights[c+1];
                heights[c+1] = temp1;

            }
            return  bubbleSort(names,heights,r,c+1);
        }
        else return  bubbleSort(names,heights,r-1,0);
    }
}