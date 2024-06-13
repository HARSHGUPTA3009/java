import java.util.Scanner;

public class exercise {

    public static int avg(int a, int b, int c) {
        int s;
        s = (a + b + c) / 3;
        return s;

    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();

        int k = avg(a, b, c);
        System.out.println("this is the average: " + k);


    }

}
