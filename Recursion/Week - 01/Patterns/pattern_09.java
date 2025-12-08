/**
 *********
  *******
   *****
    ***
     *
 */

class pattern_09{
    public static void main(String args[]){
        pattern_09(5);
    }
    static void pattern_09(int n){
        for(int row=0; row<n; row++){
            int spaces = row;
            for(int space = 0; space<spaces; space++){
                System.out.print(" ");
            }
            for (int col=row; col<2*n-1-row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
