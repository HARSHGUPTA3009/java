
import java.util.*;

public class strings {
    public static void main(String[] args) {
        
        String name =" bhess";
        Scanner kl= new Scanner(System.in);
        String a= kl.next();
        String b= kl.next();
        /*
        System.out.println(a);
        System.out.println(a+b);
        System.out.println(a.length());
        
        //transversing in string
        
        //charAt
        for (int i=0;i<a.length();i++){
            System.out.println(a.charAt(i));
            
        }
        */ 
        
        
        if (a.compareTo(b)==0){
            System.out.println("equal" );
            
            
        }else{
            System.out.println("unequal");
            if (a.compareTo(b)>0){
                System.out.println("a is greater " );}
            else{
                System.out.println("b is greater");}
                
            
                
            
        }
        
        String nanu="crocoOO is alive";

        System.out.println(nanu.substring(0,5));
        
        
        //strings are immutable
        
        

    }
}
 
