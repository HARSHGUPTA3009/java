public class rec6 {
    public static int f=-1;
    public static int l=-1;
    
    public static void occur(String s,int i,char ele){
        
        
        if (i==s.length()){
            System.out.println (f);
            System.out.println (l);
            return;
        }
        
        if (s.charAt (i)==ele){
            if (f==-1){f=i;}
            else {l=i;}
            
        }
        occur (s,i+1,ele);
        
       
    }
    
    public static void main(String[] args) {
        occur("abcdedaahba",0,'a');

    }
}
