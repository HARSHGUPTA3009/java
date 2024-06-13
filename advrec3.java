public class advrec3 {
    // place tiles on floor of given size
    // 1 into m size ki tile
    //floor of minto n size
    public static int tiles(int n,int m){
        if (n<m){return 1;}//kyuki fir toh bas seedhe hi place kar payenge
        if (n==m){return 2;}//isme ek baar hori ek baar vert kar payenge
        
        //vertically
        int vert=tiles(n-m,m);
        int hor=tiles(n-1,m);
        return hor+vert;
    }
    public static void main(String[] args) {
        System.out.println (tiles(4,2));

    }
}
