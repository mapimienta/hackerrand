import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class StoneDivision {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int sizeinipile = entrada.nextInt();
        int sizeset = entrada.nextInt();
        int[] a = new int[sizeset];
        ArrayList<Integer> avble = new ArrayList<Integer>();
        for(int i=0;i<sizeset;i++){
            a[i] = entrada.nextInt();
            if(sizeinipile%a[i]==0){
                avble.add(a[i]);
            }
        }
        String ganador = "";
        Iterator it = avble.iterator();
        while(it.hasNext()){            
            int divisiones = sizeinipile/(int)it.next();
            //System.out.println("First split initial pile");
            //System.out.println(divisiones);
            for(int i=1; i<=divisiones;i++){
                if(i%2==0){
                    ganador = "First";
                }else{
                    ganador = "Second";
                }                
            }                
        }
        System.out.println(ganador);
    }
}
