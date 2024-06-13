
import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {


        int n = 6;
        for (int k = 1; k <= n; k++) {
            for (int h = 6; h >= k; h--) {
                System.out.print("h");
            }
            System.out.println();
        }
        
        Scanner scan = new Scanner (System.in);
        int a = scan.nextInt ();
        
        for(int i=a;i>=0;i--){
            for (int j=0;j<=i;j++){
                System.out.print("P");
            }
            System.out.println ();
        }
       
        
        
    }
}
