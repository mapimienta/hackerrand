
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountingMistakes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int errores = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            
            if (i == 0) {
                if (a[i] != 1) {
                    errores++;
                }
            } else if (a[i-1] != a[i]-1) {
                //System.out.println(a[i]+":"+a[i-1]);
                errores++;
            }
        }
        
        System.out.println(errores);
    }
}
