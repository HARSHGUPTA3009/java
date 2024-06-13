public class duplirecreal {
    public static boolean[] map =new boolean[26];
    
    public static void dupli(String s,int idx,String n){
        if(idx==s.length ()){
            System.out.print(n);
            return;
        }
        
        char curr=s.charAt (idx);
        if(map[curr-'a']==true) //map mein index wise aajayega kon konse ele hai
        {
            dupli (s,idx+1,n);}
        else{
            n+=curr;
            map[curr-'a']=true;
            dupli (s,idx+1,n);}
            
        }
    //isme else se wo char add ho jayega and map pe true aajayega jaha par bhi char aaya and uske baad agar true wala firse 
    //aata jo if case hai toh next index ke liye chala jayega toh wo char add hi nhi hoga and last index se upar jaate hi yeh mast ho jayegaa
    public static void main(String[] args) {
        String k="llllhelllllllo";
        String g="";
        dupli(k,0,g);

    }
}
