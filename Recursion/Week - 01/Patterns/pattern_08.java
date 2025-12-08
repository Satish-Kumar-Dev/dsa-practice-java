/**
 *
 ***
 *****
 *******
 *********
 */

class pattern_08{
    public static void main(String args[]){
        pattern_08(5);
    }
    static void pattern_08(int n){
        for(int row=0; row<n; row++){
            int spaces = 2*n-1-row;
            for(int space = row; space<spaces; space++){
                System.out.print(" ");
            }
            for (int col=0; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
