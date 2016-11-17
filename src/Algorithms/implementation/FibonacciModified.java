package Algorithms.implementation;
import java.util.Scanner;        

public class FibonacciModified {
    static int ini =3;
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int n = in.nextInt();
        double[] fbarray=new double[n];        
        fbarray[1]=0;        
        fbarray[2]=1;
        if(n==1){
            System.out.println(fbarray[1]);
        }
        
        if(n==2){
            System.out.println(fbarray[2]);
        }        
                                     
        if(n==3){
            
        }
        
        fDP(n,fbarray);
    }
    

    
    static public void fDP(int n, double[] fb_array){
        if(ini<=n){
            fb_array[n]=fb_array[n-2] + Math.pow(fb_array[n-1],2);
            ini++;
            fDP(n,fb_array);
        }
        
        System.out.println();
    }
}

