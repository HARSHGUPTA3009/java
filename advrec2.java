public class advrec2 {
    public static int pathcount(int i,int j,int m,int n){
        if (n==i || m==j){
           return 0; 
        }
        if (i==n-1 && j==m-1){
            return 1;
        }
        //downwards
        int down=pathcount (i+1,j,n,m);
        //right
        int right=pathcount (i,j+1,n,m);
        
        return down+right;
        
        
    }
    public static void main(String[] args) {
        System.out.println (pathcount (0,0,3,3));

    }
}
