
public class duplicatewithrec {
    
    public static void dupli(String s){
        String k=s;
        
    
        for(int i=0;i<s.length ();i++){
            for(int j=0;j<s.length ();j++){
                if( s.charAt (i)==s.charAt (j)){
                    if(i==j){
                        
                    }
                    System.out.print(s.charAt (i));
                }
            }
        }
        
        
        
    }
    public static void main(String[] args) {
        String h="lhello";
        
        dupli (h);
        
        
    }
}
