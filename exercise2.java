import java.util.Scanner;

public class exercise2 {
    public static int pow(int n,int x){
        int k=1;

        for (int i=0;i<n;i++)
            k=k*x;

        System.out.println(k);
        return k ;


        
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("power:");
        int a = read.nextInt();
        System.out.println("power of:");
        int b=read.nextInt();

        pow(a,b);


    }
}
