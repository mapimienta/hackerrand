import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*public class Solution2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        
        int al = a.length();
        int bl = b.length();
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();        
    }
    
    public int anagram(char[] a1, char[] b1, int i,int j, int cont){
        
        if(a1.length > b1.length){
            if(b1[j]==a1[i] && i < a1.length){
                cont++;
                i++;
                anagram(a1,b1,i,j,cont);
                return 0;
            }else{
                if(j<b1.length){
                i=0;
                j++;
                anagram(a1,b1,i,j,cont);
                return 0;
                }else{
                    return cont;
                }
            }
        }else{            
            if(a1[j]==b1[i] && i < b1.length){
                cont++;
                i++;
                anagram(a1,b1,i,j,cont);
                return 0;
            }else{
                if(j<a1.length){
                i=0;
                j++;
                anagram(a1,b1,i,j,cont);
                return 0;
                }else{
                    return cont;
                }
            }            
        }    public static void main(String []argh){

    }    
}*/

class Solution2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> m = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            m.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(m.get(s)==null){
                System.out.println("Not found");
            }else{
                System.out.println(s+" "+m.get(s));
            }
        }
        in.close();
    }
}
