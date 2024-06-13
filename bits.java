public class bits {
    public static void main(String[] args) {
        // get bits
        
        int n=5;  //0101
        int pos=2;
        int bm=1<<pos;
        
        if ((bm & n)==0)
            System.out.println("zero");
        else
            System.out.println("non zero");
        // set bit
        int nk=5;
        int poss=1;
        int bmm=1<<poss;
        System.out.println (bmm);

        System.out.println(bmm|nk);
        
        //clear bit
        System.out.println((~bm)&n);
        
        //update bit
        int g=6;
        int pos1=0;
        int pos2=1;
        int bmmm=1<<pos1;
        int bmmk=1<<pos2;
        int k=g|bmmm;
        int h=k&(~bmmk);
        System.out.println(h);
        
        
        
        
        
        
        
                
        

    }
}
