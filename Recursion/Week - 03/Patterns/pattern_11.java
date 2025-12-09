/**
 **********
 ****  ****
 ***    ***
 **      **
 *        *
 *        *
 **      **
 ***    ***
 ****  ****
 **********
 */

class pattern_11{
    public static void main(String args[]){

        pattern_11(10);
    }
    static void pattern_11(int n){
        for(int row=0; row<n; row++){
            int cols = row<n/2 ? n/2: row - (n/2);
            for (int col=row; col<=cols; col++){
                System.out.print("* ");
            }
            int spaces = row< n/2 ? (n/2)-row: n/2;
            for(int space = 0; space<spaces; space++){
                System.out.print(" ");
            }
            for (int col=row; col<=n/2; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
