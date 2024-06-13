public class rec4 {
    public static void tower(int n,String src,String helper,String dest){
        if (n==1){
            System.out.println ("transfer "+n+" from "+src+" to "+dest);
            return;
        }
        tower(n-1,src,dest,helper);
        System.out.println ("transfer "+ n+" from "+src+" to "+dest);
        tower(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        //tower of hanoi
        int n=3;
        //towers be s,h,d;
        tower (n,"S","H","D");
        
    }
}
/* c version 
#include <stdio.h>
void tower(int n,char *s,char *h,char *d){
    if (n==1){
        printf("move %d from %c to %c \n",n,*s,*d);
        
        return;
    }
    tower(n-1,s,d,h);
    printf("move %d from %c to %c \n",n,*s,*d);
    tower(n-1,h,s,d);
    
}
int main() {
    int n=3;
    tower(n,"a","b","c");

}
 */
