/**
 *****
 *****
 *****
 *****
 *****
 */
 */
/
class pattern_01{
    public static void main(String args[]){
        pattern_01(5);
    }
    static void pattern_01(int n){
        for(int row=0; row<n; row++){
            for (int col=0; col<n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}