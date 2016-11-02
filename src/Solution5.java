import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nt = scan.nextInt();
        long starttime = System.currentTimeMillis();
        for(int i=0;i<nt;i++){
            int np = scan.nextInt();
            if(np%2==0 || np%3==0 || np%5==0 || np%7==0){
                System.out.println("Not Prime");
            }else{
                System.out.println("Prime");
            }
        }
        long finishtime = System.currentTimeMillis();
       
    }    
}
