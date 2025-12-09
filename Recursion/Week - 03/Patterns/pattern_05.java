/**
 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *
 */
 */
         /
class pattern_05{
    public static void main(String args[]){
        pattern_05(5);
    }
    static void pattern_05(int n){
        for(int row=0; row<2*n; row++){
            int totalCols = row<=n ? row : 2*n - row;
            for (int col=1; col<=totalCols; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}