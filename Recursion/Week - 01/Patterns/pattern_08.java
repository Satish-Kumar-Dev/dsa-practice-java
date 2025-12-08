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
            int spaces = n - row;
            for(int space = 0; space<spaces; space++){
                System.out.print(" ");
            }
            for (int col=1; col<2*row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
