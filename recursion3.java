public class recursion3 {
    //x^n stack height =logn
    // x^n= n/2 and n/2 agar n even ho 
    // m/2 and n/2 and 1 agar odd because x/2 round off ho jayega
    // 7 hoga toh 3 3 and 1 ho jayega
    //so n/2^alpha =1
    //so n=2^alpha
    //toh log dono sides
    //logn base 2 = alpha

    public static int po(int x,int n) {
        int f = 1;

        if (n == 0) {
            return 1;
        } 
        //n even
        if(n%2==0){
            return po (x,n/2)*po (x,n/2);
            
        }
        else{// n is odd
            return po (x,n/2)*po (x,n/2)*x;
        }
        
    }
    
    
    
    public static void main(String[] args) {
            System.out.println (po(2,6));
        }
        

    
}
