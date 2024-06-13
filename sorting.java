import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {

        int [] num={7,8,3,1,2};
        //time complexity =O(n^2)
        int n=num.length;
     //bubble sort  
        
        for (int j=0;j<n-1;j++){
            for (int i=0;i<n-j-1;i++){
                if(num[i]>num[i+1]){
                    int t=num[i];
                    num[i]=num[i+1];
                    num[i+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(num));
        
        
        //selection sorting
        for (int i=0;i<n-1;i++) {
            int s = i;
            for (int j = i + 1; j < n; j++) {
                if (num[s] > num[j])
                    s = j;

            }
        
            
        int temp=num[s];
        num[s]=num[i];
        num[i]=temp;}

        System.out.println(Arrays.toString(num));
         
        
        //insertion sorting
        for (int i=0;i<n;i++){
            int c=num[i];
            int j=i-1;
            while(j >= 0 && num[j] > c) {
                //Keep swapping
                num[j+1] = num[j];
                j--; }
            num[j+1] = c;
            
            
        }
        System.out.println(Arrays.toString(num));
            
    }
    
    
}
        
        
        
        
        
         
        
        
        
        
        
        
        
        
        
    

