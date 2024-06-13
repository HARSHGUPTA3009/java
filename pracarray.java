
import java.util.*;


public class pracarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();

        int[][]array=new int[r][c];

        //input
        System.out.println("input time :)");
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++)
                array[i][j] = sc.nextInt();
            
        }
        
        
        int [][] arrayy=new int[c][r];
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                arrayy[i][j]=array[j][i];
                
                
            }
        }
        for(int i=0;i<r;i++) {

            for (int j = 0; j < c; j++) {
                System.out.println (arrayy[i][j]);
            }
        }
               
        
        
        
        
        
        System.out.println("enter the no to find:");
        int k= sc.nextInt();
        for(int i=0;i<r;i++) {

            for (int j = 0; j < c; j++) {
                if (array[i][j]==k)
                    System.out.print("("+i+","+j+")");

            }


        }
    }
} 
