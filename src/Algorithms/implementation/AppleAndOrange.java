package Algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleAndOrange {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int cm = 0;
        int cn = 0;
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            int dm = apple[apple_i]+a;
            if(dm>=s && dm<=t){
                cm++;
            }
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            int distancia = b+orange[orange_i];
            //System.out.println("orange distance:"+s+":"+distancia+":"+t);
            int dn = b + orange[orange_i];
            if(dn>=s && dn<=t){
                cn++;
            }
        }   
        
        System.out.println(cm);
        System.out.println(cn);
    }
}
