public class keypadques {
    public static String []keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
            "tu", "vwx", "yz"};
    
    public static void key(String s,int idx,String n){
        if (idx==s.length ()){
            System.out.println (n);
            return;
        }
        char curr = s.charAt (idx);
        String map= keypad[curr-'0'];
        for(int i=0;i<map.length ();i++) key (s, idx + 1, n + map.charAt (i));
        
    }
    public static void main(String[] args) {
        String k="23";
        key (k,0,"");
        

    }
}
