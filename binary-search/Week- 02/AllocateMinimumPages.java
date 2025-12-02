class AllocateMinimumPages {
    public int allocatePages(int[] arr, int students) {
        /**
         * To allocate books to students we need to know Minimum Pages that we can give to a student
         * and the maximum number of pages to a student
         * start and end variables are used to minimum and maximum pages
         * that we can give for a single student
         */
        if(student > arr.length-1) return -1;
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }
    while(start < end){
        int mid = start + (end-start)/2;
        /**
         * We need two variables to help us with the book allocation
         * */
        int sum = 0;
        int count = 1;
        for(int num: arr){
            /**
             * Here we check whether the pages giving to a student
             * exceeds mid if yes
             * we are assigning that book to the new student and changing
             * sum to the present variable
             * */
            if(sum+num > mid){
                sum = num;
                count++;
            }
            /**
             * Else we are just adding pages to the present student
             * */
            else
            sum+=num;
        }
        /**
         * We need to check whether we can give the mid pages to more students
         * or pages are not sufficient to the present students itself
         * If we can give it to more students then we can try increasing the pages
         * */
        if(students < count) end = mid;
        /**
         * Else we'll decrease the pages
         * */
        else start = mid+1;
    }
/**
 * At the end start and end points at the same number then we can return any one of them
 * */
return start;
    }
}