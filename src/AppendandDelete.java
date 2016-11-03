import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppendandDelete{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        
        if(s.compareTo(t)==0){
            System.out.println("Yes");
        }else{
            System.out.println(canConvert(s,t,k));
        }
    }
    
    public static String canConvert(String s, String t, int k){
        int ndif = 0;
        int howmanytobeequal=0;
        String retorno;
        String quitar = "N";
        int total=0;
        if(s.length() > t.length()){
            ndif = s.length()-t.length();
            quitar = "S";
        }else{
            if(s.length()<t.length()){
                ndif = t.length()-s.length();
            }else{
                quitar="I";
            }
        }
        
        if(ndif > k){
            return "No";
        }
        
        for(int j =0; j < s.length(); j++){
            if(!String.valueOf(s.charAt(j)).equals(String.valueOf(t.charAt(j)))){
                ndif=s.length()-j;
                //System.out.println("char dif:"+String.valueOf(s.charAt(j)));
                //System.out.println("quitar:"+quitar);
                //System.out.println("ndif:"+ndif);
                if(ndif > k){
                    return "No";
                }                
                if(quitar.equals("S")){                    
                    howmanytobeequal = t.length()-j;  
                    total = ndif+howmanytobeequal;
                    break;
                }else{
                    if(quitar.equals("N")){
                        howmanytobeequal = t.length()-j; 
                        total = ndif+howmanytobeequal;
                    }else{
                        total=ndif+ndif;
                    }
                }
                break;
            }
            
        }
        
        
        if(total>k){
            retorno = "No";
        }else{
            retorno = "Yes";
        }
        /*System.out.println(total);
        System.out.println(ndif);
        System.out.println(howmanytobeequal);*/
        return retorno;
    }
}
