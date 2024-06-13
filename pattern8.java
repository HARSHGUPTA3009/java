
public class pattern8 {
    public static void main(String[] args) {



/*
        //floyd's triangle
        1
        23
        456
        78910
        1112131415
*/

        int n=5;
        int g=1;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(g+" ");
                g++;}
            System.out.println();
        }
        
        int u=10;
        int o=1;
        for (int i=1;i<=u;i++){
            for(int j=1;j<=i;j++){
                System.out.print(o+" ");
                o+=2;}
            System.out.println ();}
        

    }
}
