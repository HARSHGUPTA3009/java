
import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();




        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");


            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= n - 2; i++) {
            System.out.print("*");
            for (int j = 1; j <= i; j++)
                System.out.print(" ");
            System.out.print("*");

            for (int j = n - 3; j >= i; j--)
                System.out.print("  ");
            System.out.print("*");
            for (int j = 1; j <= i; j++)
                System.out.print(" ");
            System.out.print("*");


            System.out.println();

//lower
        }
        for (int j = n - 2; j >= 1; j--) {
            System.out.print("*");
            for (int k = j; k >= 1; k--)
                System.out.print(" ");
            System.out.print("*");
            for (int l = n - 3; l >= j; l--)
                System.out.print("  ");
            System.out.print("*");
            for (int o = j; o >= 1; o--)
                System.out.print(" ");
            System.out.print("*");


            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 2; j >= i; j--)
                System.out.print("*");

            for (int j = 2 * n + 1; j >= (2 * (n - 1 - (n - 5) - i)); j--)
                System.out.print(" ");


            for (int j = 2; j >= i; j--)
                System.out.print("*");
            System.out.println();
        }
       
    }
}
