

public class pattern10 {
    //butterfly
    public static void main(String[] args) {

        int n = 5;


        for (int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");


            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i=1;i<=n;i++) {
            for (int j = n; j >=i; j--)
                System.out.print("*");

            for (int j=n+2;j>=(2*(n-i));j--)
                System.out.print(" ");

            for (int j = n; j >=i; j--)
                System.out.print("*");


            System.out.println();
            


        }
        System.out.println ();
        
        int f=10 ;
        for(int i=1;i<=f;i++){
            for(int j=1;j<=i;j++) {
                System.out.print("^");
            }
            for (int p =4*(f-i)-1;p>=0;p=p-2)
                System.out.print(" ");
            
            for(int j=1;j<=i;j++) {
                System.out.print("^");
            }
            System.out.println ();
        }
        for(int i=1;i<=f;i++) {
            for (int j=f;j>=i;j--) {
                System.out.print("^");}
            
            for (int p =0;p<=4*(i-1)-1;p=p+2)
                System.out.print(" ");

            for (int j=f;j>=i;j--) {
                System.out.print("^");}
            
            System.out.println ();
            
        }
        int k=10;
        for(int i=1;i<=k;i++){
            for(int j=1;j<=i;j++){
                System.out.print("!");
            }
            for(int l=4*(k-i)-1;l>=0;l=l-2){
                System.out.print(" ");
                
            }
            for(int j=1;j<=i;j++){
                System.out.print("!");
            }
            System.out.println ();
           
        }
        }
        
                
    
    }
    







