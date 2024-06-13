import java.util.Scanner;

public class recursion1 {
    /*
    public static void num(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println (n);
            num (n - 1);
        }

    }

    public static void natnum(int i,int n,int sum) {
        if(i==n){
            sum+=i;
            System.out.println (sum);
            return;
           
        }
        sum+=i;
        natnum (i+1,n,sum);
    }
    public static int fact(int i){
        int f=1;
        if (i==0||i==1){
            return 1;}

        f=i*fact(i-1);
        
        return f;
        
    }*/
    public static void fibo(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println (c);
        fibo(b,c,n-1);
      
        
        
    }
        

        public static void main (String[]args){
      //      num (5);
      //      natnum (1,100,0);
      //      System.out.println (fact (5));
            int a=0;int b=1;
            
            Scanner read=new Scanner(System.in);
            int n =read.nextInt();
            System.out.println (a);
            System.out.println (b);
            
            
            fibo(a,b,n-2);
            
            
           

        }
    }

