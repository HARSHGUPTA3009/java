public class ptn20cpy {
    public static void main(String[] args) {
        //upper
        int n=6;

        for (int i=1;i<=2;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            
            System.out.println ();
       }
        
        for(int i=1;i<=n-2;i++){
            System.out.print("*");
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            
            for(int s=1;s<=2*(n-3)-2*(i-1);s++){
                System.out.print(" ");
            }

            System.out.print("*");
            for(int j=1;j<=i;j++){
                System.out.print(" ");}
            System.out.print("*");

            System.out.println ();
        }
        
        //lower
        for(int i=1;i<=(n-2);i++){
            System.out.print("*");
            for(int j=n-2;j>=i;j--){
                System.out.print(" ");
            }
            System.out.print("*");

            for(int s=1;s<=2*i-2;s++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=n-2;j>=i;j--){
                System.out.print(" ");
            }
            System.out.print("*");
  
            System.out.println ();
        }

        for (int i=2;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }


            System.out.println ();
        }
        
           
    }
}   

        

        

        

