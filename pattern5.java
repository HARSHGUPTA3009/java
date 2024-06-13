
public class pattern5 {
    public static void main(String[] args) {


        /*
            *
           **
          ***
         ****
         */
        
        int c=6;
        for(int i=1;i<=c;i++){
            for(int j=c-i-1;j>=0;j--){
                System.out.print(" ");}
            for(int o=1;o<=i;o++){
                System.out.print("^");}
            System.out.println ();
            
            
        }
        


        int n = 5;
        for (int g = 0; g < n; g++) {
            for (int d = 5; d >= g; d--)
                System.out.print(" ");
            for (int s = 1; s <= g; s++)
                System.out.print("*");
            System.out.println();
        }
    }
}
