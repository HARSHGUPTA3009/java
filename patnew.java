public class patnew {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<5;i++){
            for(int j=n-1-i;j>=0;j--){
                System.out.print(" ");
                
            }
            for(int k=n-i;k>0;k--){
                System.out.print("*");
            }
            System.out.print("  ");
            for(int k=n-i;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
            
        }
        

    }
}
