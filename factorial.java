import java.util.Scanner;

public class factorial {
    public static int fac(int a) {
        int k=1;

        for(int j=a;j>0;j--){
            k=k*j;


        }
        System.out.println(k);
        return k;


    }


        public static void main(String[] args) {
            Scanner read=new Scanner(System.in);
            int a =read.nextInt();
            fac(a);


    }
}
