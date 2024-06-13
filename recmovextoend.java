public class recmovextoend {
    public static void xend(String s, int idx,int y,String n){
        
        if(idx==s.length ()){
            System.out.print(n);
            for(int i=0;i<y;i++){
                System.out.print("x");
                
              
            }
            return;
        }
  
        char curr=s.charAt (idx);
        if(curr=='x'){
            y++;
            xend (s,idx+1,y,n);
        }
        else{
            n+=curr;
            xend (s,idx+1,y,n);
            
        }
    }
   
    public static void main(String[] args) {
        String a="hexhex";
        String h="";
        xend (a,0,0,h);
       
        

    }
}
// abxcxxdx hai toh jab jab x hoga count mei count kar lenge aur jab jab non x toh new string mein add kar denge and if case mein jab idx 
//length ke equal toh x into counter add kar denge
