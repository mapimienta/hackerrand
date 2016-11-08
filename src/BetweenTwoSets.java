import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        int menor_b=0;
        int contador = 0;        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
                
        int na = getFactor(a,0);
        //System.out.println(na);
        
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
        
        int nb = getFactor2(b,0,menor_b, na);
        //System.out.println(nb);
                
        /*int temp = na;
        while (na <= nb) {            
            if(nb%na==0)
                contador++;
            na = na + temp;            
        } */ 
        
        System.out.println(nb);
    }
    
    static int getFactor(int[] a, int i) {
        if (i < a.length) {
            for (int j = 0; j < a.length; j++) {
                //System.out.println(a[i]+":"+a[j]);
                if(a[j]!= 0 && a[i]!=0){
                    if(a[i]!=a[j] && i != j){                
                        if (a[i] % a[j] == 0) {
                            a[j] = 0;
                        }
                    }
                }
            }
            i++;
            getFactor(a, i);
        }
        int retorno = 1;
        for (int h = 0; h < a.length; h++) {
            if (a[h] != 0) {
                retorno = retorno * a[h];
            }            
        }
        return retorno;
    }
    
    static int getFactor2(int[] a, int i, int menor, int fact) {

        
        if (i < a.length) {
            for (int j = 0; j < a.length; j++) {
                //System.out.println(a[i]+":"+a[j]);
                if(a[j]!= 0 && a[i]!=0){
                    if(a[i]!=a[j] && i != j){                
                        if (a[i] % a[j] == 0) {
                            a[i] = 0;
                        }
                    }
                }
            }
            i++;
            getFactor2(a, i, menor,fact);
        }
    int retorno = 0;        
                //retorno = retorno * a[h];
    int temp = fact;
    boolean factor_=true;
        while(temp<=menor){
            factor_ = true;
            for (int h = 0; h < a.length; h++) {
                if (a[h] != 0) {
                    if(a[h]%temp==0){
                        factor_ = true;
                    }else{
                        factor_=false;
                        break;
                    }
                }                         
            }
            if(factor_==true){
                
                retorno++;
            }
            temp+=temp;
        }
    
        return retorno;
    }    
}

