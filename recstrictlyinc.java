public class recstrictlyinc {
    public static boolean sinc(int[] arr, int idx){
        if(idx==(arr.length-1)){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return sinc (arr,idx+1);
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int []array={1,2,3,4,5};
        System.out.println (sinc (array,0));
        

    }
}
