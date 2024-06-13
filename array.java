import java.util.*;


public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] num =new int[size];

         for(int i=0;i<size;i++)
             num[i]=sc.nextInt();

        System.out.println("search num:");
        int a=sc.nextInt();






        for(int i=0;i<size;i++) {
            if (num[i] == a) {
                System.out.println(i);

            }
        }


        /*
        int[]marks= new int[3];
        marks[0]=99;
        marks[1]=9;
        marks[2]=93;

        int[]kol={ 1,2,3,4,56};


        System.out.println(marks[1]);
        */




    }
}
