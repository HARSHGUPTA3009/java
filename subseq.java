import java.util.HashSet;

public class subseq {
    public static void subsequ(String s,int idx,String n,HashSet<String> hash){
        if (idx==s.length ()){
            if (!hash.contains (n)) {
                hash.add (n);
                System.out.println (n);
            }
            return;

        }
        
        char curr=s.charAt (idx);
        
        //to be
        subsequ (s,idx+1,n+curr,hash);
        //no
        subsequ (s,idx+1,n,hash);
    }
    
    
    public static void main(String[] args) {
        String o="aaaa";
        String h="";
        HashSet<String> set= new HashSet<> ();
        
        subsequ (o,0,h,set);

    }
}
