import java.util.Scanner;


public class prime {
    //
    public static void main(String[] args) {
        Scanner f = new Scanner (System.in);
        int h = f.nextInt ();
        int c = 0;

        for (int j = 1; j <= h; j++) {
            if (h % j == 0) {
                c++;
            }
        }

            if (c == 2) {
                System.out.println ("prime");
            }
            else System.out.println ("not prime");
        }
    }

