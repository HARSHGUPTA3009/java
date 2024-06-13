public class recursion2 {
    public static int po(int x,int n){
        int f=1;
        
        if (n==0){
            return 1;
        }
        else{
            f=x*po(x,n-1);
            return f;}
    }
    public static void main(String[] args) {
        System.out.println (po(0,5));
        

    }
}
