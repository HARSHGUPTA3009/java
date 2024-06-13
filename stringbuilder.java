import java.sql.SQLOutput;
import java.util.*;

public class stringbuilder {
    public static void main(String[] args) {
        
        StringBuilder ab= new StringBuilder("croco");// JUST LIKE SCANNER
        System.out.println(ab);
//1
        
        System.out.println(ab.charAt(0));
//2        
        ab.setCharAt(0,'C'); //REPLACE KARDEGA CHAR KO USKI JAGH
        System.out.println(ab);
//3
        ab.insert(5,"dile"); // STRING ADD KAR DEGA USS VALUE SE
        System.out.println(ab);
//4
        ab.delete(2,3); // IS RANGE KE BEECH AND STARTING PART DELETE THAT IS INDEX 2 BAS 
        
//5
        ab.append(" can swim"); //APNE AAP END MEIN HOGA ADD
        
//6  
        System.out.println(ab.length());  
//7
        for(int i=0; i<ab.length()/2; i++) {
            int front = i;
            int back = ab.length() - i - 1;


            char frontChar = ab.charAt(front);
            char backChar = ab.charAt(back);


            ab.setCharAt(front, backChar);
            ab.setCharAt(back, frontChar);
        }


        System.out.println(ab);
    }
}
