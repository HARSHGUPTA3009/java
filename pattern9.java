
public class pattern9 {
    public static void main(String[] args) {



        // 0 1 triangle
        for(int i=0;i<=5;i++) {
            for(int j=0;j<=i;j++){

                if ((i+j)%2==0){
                    System.out.print("1");}
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        int n=8;
        
        for(int u=0;u<=n;u++){
            for(int o=0;o<=u;o++){
                if ((o+u)%2==0)
                    System.out.print("1");
                else {
                    System.out.print("0");}
                
                
                }
            System.out.println ();
        
            }
        }
    }




