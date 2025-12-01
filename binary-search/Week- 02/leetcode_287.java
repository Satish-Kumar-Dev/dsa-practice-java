class Solution {
    public int findDuplicate(int[] arr) {
        int i = 0;
        while(i<arr.length){
            /**
             We need to check whether the element is placed in it's correct position or not
             We get it's correct position by arr[i]'s correct position will be arr[i]-1.
             If it is not in correct place
             */
            if(arr[i]!= i+1){
                int correct = arr[i]-1;
                /**
                 We need to check what is in the correct place
                 If arr[i] and arr[correct] are not same then swap the elements
                 */
                if(arr[i]!=arr[correct])
                    swap(arr,i,correct);
                /**
                 Else return the current element
                 */
                else return arr[i];
            }
            /**
             It the element is in correct place just move the i to the next index
             */
            else i++;
        }
        return -1;
    }
    void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}