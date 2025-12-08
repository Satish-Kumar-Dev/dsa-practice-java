/**
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 */
 */
         /
class pattern_04{
    public static void main(String args[]){
        pattern_04(5);
    }
    static void pattern_04(int n){
        for(int row=1; row<=n; row++){
            for (int col=1; col<=row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}