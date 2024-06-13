public class pattern14 {
    public static void main(String[] args) {
        int n = 4;


        //upper part
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //lower part
        for(int i=n; i>=1; i--) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=1;i<=n;i++){
            for(int a=n-i-1;a>=0;a--) {
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("^");
                
            }
            System.out.println ();
            
        }
        for(int i=n;i>=1;i--){
            for(int g=1;g<=n-i;g++){
                System.out.print(" ");
            }
            
            for(int j=2*i;j>1;j--){
                System.out.print("^");
            }
            System.out.println ();
        }
 
    }
}
