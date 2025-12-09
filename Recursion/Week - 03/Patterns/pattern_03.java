/**
 *****
 ****
 ***
 **
 *
 */
 */
         /
class pattern_03{
    public static void main(String args[]){
        pattern_03(5);
    }
    static void pattern_03(int n){
        for(int row=0; row<n; row++){
            for (int col=0; col<n-row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}