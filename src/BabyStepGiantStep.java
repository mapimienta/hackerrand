import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BabyStepGiantStep {
    public static void main (String[] args){
        int x1 = 0;
        int y1 = 0;
        double yf = 0;
        double recorrido;
        int pasos;
        double falta;
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();

        //System.out.println(m);
        
        for(int i=0;i<q;i++){
            double a = s.nextDouble();
            double b = s.nextDouble();
            double d = s.nextDouble();
            recorrido = 0;
            pasos=0;
            falta=0;   
            
            if(d==0){
                System.out.println(0);
                continue;
            }
                        
            if(a>d && b > d){
                Math.sqrt(Math.pow((d/2-0),2)+Math.pow((a/2),2));
                
                if(a<b){
                    //System.out.println(Math.pow(a, 2));
                    //System.out.println(Math.pow(d/2, 2));
                    yf = Math.sqrt(Math.pow(a, 2)-Math.pow(d/2, 2));
                    pasos=2;
                }else{
                    yf = Math.sqrt(Math.pow(b, 2)-Math.pow(d/2, 2));
                    pasos=2;
                }
            }else{
                if(a<b){
                    recorrido = b;
                    while(recorrido<=d){
                        recorrido=recorrido+b;
                        pasos++;
                    }
                    
                    if(recorrido > d){
                        recorrido=recorrido-b;
                        falta = d-recorrido;
                        if(a==falta){
                            pasos++;
                        }else{
                            pasos=pasos+2;
                        }
                    }
                                        
                    //yf = Math.sqrt(Math.pow(a, 2)-Math.pow(d/2, 2));
                }else{
                    recorrido = a;
                    while(recorrido<=d){
                        recorrido=recorrido-b;
                        pasos++;
                    }
                    
                    if(recorrido > d){
                        recorrido=recorrido-b;
                        falta = d-recorrido;
                        
                        if(b==falta){
                            pasos++;
                        }else{
                            pasos=pasos+2;
                        }
                    }                    
                    //yf = Math.sqrt(Math.pow(b, 2)-Math.pow(d/2, 2));
                }                
            }            
            System.out.println(pasos);
        }
    }
}
