

public class pattern15 {
    public static void main(String[] args) {

        int n=5;

        for(int i=1;i<=n;i++){
            for (int j=n-1;j>=i;j--)
                System.out.print(" ");

            System.out.print("*");
            System.out.println();


        }
        for(int i =1;i<=n;i++){
            for (int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            System.out.println ("*");
            System.out.println ();
        }
        




    }
}
