import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solucion7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        int mayor_a = 0;
        int menor_b = 0;
        int contador = 0;
        int factor = 0;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            if(a_i==0){
                mayor_a = a[a_i];
            }
            
            if(a[a_i]>mayor_a){
                mayor_a = a[a_i];
            }
        }       
        
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
            
            if(b_i == 0){
                menor_b = b[b_i];
            }
            
            if(b[b_i]<menor_b){
                menor_b = b[b_i];
            }
        }
        
        if(mayorIsFactor(a,mayor_a)){        
            while(mayor_a <= menor_b){
                contador++;
                mayor_a+=mayor_a;
            }
        }else{
        }
        
        System.out.println(contador);
    }
    
    static boolean mayorIsFactor(int[] a,int mayor){        
        boolean retorno = true;
        for(int j=0;j<a.length;j++){
            if(mayor%a[j]!=0){
                retorno=false;
                break;
            }                             
        }               
        return retorno;
    }
    
    static int getFactor(int[] a, int i, int mayor,int sw){
        if(i<a.length){
            for(int j=1;j<a.length;j++){

            }
        }
        return 0;
    }
}
