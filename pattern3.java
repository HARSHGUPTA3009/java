
public class pattern3 {
    public static void main(String[] args) {


//        *
//        **
//        ***
//        ****
        
        int a=4;
        for(int i=0;i<a;i++){
            for (int j=0;j<=i;j++){
                System.out.print ("^");
                
            }
            System.out.println ();
                
        }
        

        int n=6;
        for(int k=1;k<=n;k++){
            for(int h=1;h<=k;h++) {
                System.out.print("*");
            }
            System.out.println();

        }

}}
