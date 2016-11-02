
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Soluction6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        int total = 0;
        int position = 0;
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
            
            if(c_i==0){
                a.add(c[c_i]);
            }else{
                position = 0;
                for (int elem : a) {                
                    if (elem == c[c_i]) {
                        total+=1;  
                        a.remove(position);
                        position+=1;
                        break;
                    }                   
                }
                a.add(c[c_i]);
            }
        }
        System.out.println(total);
    }
}
