/**
 *****
 ****
 ***
 **
 *
 */
class pattern_07{
    public static void main(String args[]){
        pattern_07(5);
    }
    static void pattern_07(int n){
        for(int row=0; row<n; row++){
            int spaces = row;
            for (int col=1; col<=spaces; col++) {
                System.out.print(" ");
            }
            for (int col=0; col<=n-row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
