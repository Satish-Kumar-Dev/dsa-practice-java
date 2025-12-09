/**

 */

class pattern_10{
    public static void main(String args[]){

        pattern_10(5);
    }
    static void pattern_10(int n){
        for(int row=0; row<n; row++){
            int spaces = n-row;
            for(int space = 0; space<=spaces; space++){
                System.out.print(" ");
            }
            for (int col=0; col<row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
