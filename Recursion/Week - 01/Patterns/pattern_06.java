/**
      *
     **
    ***
   ****
 *****
 */
 */
         /
class pattern_06{
    public static void main(String args[]){
        pattern_06(5);
    }
    static void pattern_06(int n){
        for(int row=0; row<n; row++){
            int spaces = n-row-1;
            for (int col=1; col<=spaces; col++) {
                System.out.print(" ");
            }
            for (int col=0; col<row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}