
public class pattern4 {
    public static void main(String[] args) {


        /*
         ****
         ***
         **
         *
         */
        
        int u=5;
        for(int h=u;h>=1;h--){
            for (int i=1;i<=h;i++){
                System.out.print("^");
            }
            System.out.println ();
            
        }
        


        int n = 6;
        for (int k = 1; k <= n; k++) {
            for (int h = 6; h >= k; h--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
