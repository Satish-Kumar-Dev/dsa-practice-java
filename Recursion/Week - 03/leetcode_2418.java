/**
 * Example for Selection Sort
 */

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        return selectionSort(names,heights,names.length,0,0);
    }
    String[] selectionSort(String[] names, int[] heights,int r, int c,int max){
        if(r==0) return names;
        if(c < r){
            if(heights[c] < heights[max]){
                max = c;
            }
            return  selectionSort(names,heights,r,c+1,max);
        }
        else {
            String temp = names[max];
            names[max] = names[r-1];
            names[r-1] = temp;
            int temp1 = heights[max];
            heights[max] = heights[r-1];
            heights[r-1] = temp1;
            return  selectionSort(names,heights,r-1,0,0);
        }
    }
}