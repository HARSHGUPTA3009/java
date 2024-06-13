
public class pattern11 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++)
                System.out.print("*");


            System.out.println();
        }
        for (int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print (" ");
            }
            for (int k=1;k<=n;k++){
                System.out.print("^");
            }
            System.out.println ();
        }
        for(int i=1;i<=n;i++){
            for(int k=n-i;k>0;k--){
                System.out.print(" ");

            }
            for(int k=n;k>=0;k--){
                System.out.print("!");
            }
            System.out.println ();
            
        }
        
        
        
    }
}

