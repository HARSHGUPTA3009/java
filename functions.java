import java.util.*;


public class functions {


    public static int MyName(int a,int b) {
        int s=a*b;

      
        return s;



    }
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int a =read.nextInt();
        int b =read.nextInt();

        MyName(a,b);
        int c=MyName (a,b);
        System.out.println (c);
    }

    }
    
