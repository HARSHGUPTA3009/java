public class advrec4 {
    //no of ways to invite 4 to single
    
    /*
    maanlo agar 4 hai toh 
    * 1 2 3 4 toh 
    * ek case jisme sab alag isme 1 case
    * fir 1 ko ek ek karke 2 ,3 , 4 se karke pair and no pair ke saaath 
    * 3*2=6 cases
    * fir 1 ko chodke baaki 3 case jab wo pair kare 2-3 3-4 2-4 = 3case
    */
    public static int guestcall(int n){
        if (n<=1){
            return 1;
            
        }
        int single=guestcall (n-1);
        int pair=(n-1)*guestcall (n-2);
        return single+pair;
        
    }
    public static void main(String[] args) {
        System.out.println (guestcall (4));
        
        

    }
}
