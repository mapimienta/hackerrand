import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String number = in.next();

        char[] pal = number.toCharArray();
        int longitud = 0;
        if (n % 2 == 0) {
            longitud = pal.length;
        } else {
            longitud = pal.length - 1;
        }

        if (pal.length == 1) {
            System.out.println(9);
            return;
        }

        /*for (int i = 0; i < longitud / 2; i++) {
            if (pal[i] == pal[pal.length - 1 - i]) {
            } else if (k > 0) {
                if (pal[i] >= pal[pal.length - 1 - i]) {
                    if (pal[i] == 9) {
                    } else if (k > 1) {
                        pal[i] = '9';
                        k--;
                    }
                    pal[pal.length - 1 - i] = pal[i];
                    k--;

                } else {
                    if (pal[pal.length - 1 - i] == 9) {
                    } else if (k > 1) {
                        pal[pal.length - 1 - i] = '9';
                        k--;
                    }
                    pal[i] = pal[pal.length - 1 - i];
                    k--;

                }
            } else {
                System.out.print("-1");
                return;
            }
            //System.out.println(String.valueOf(pal));
            boolean retorno = isPal(pal, 0, longitud);
            //System.out.println("valor retornado:" + retorno);
            if (retorno) {
                break;
            }
        }*/
        char[] palindromo = palindromo(pal, k, longitud, 0);
        if (k > 0) {
            pal = pals(palindromo, k, longitud, 0);
        }

        String palf = String.valueOf(pal);
        System.out.println(palf);
    }

    private static boolean isPal(char[] pal, int i, int l) {
        String palin = String.valueOf(pal);

        if (palin.charAt(i) == palin.charAt(palin.length() - 1 - i)) {
            if (i < l / 2) {
                i++;
                isPal(pal, i, l);
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    ///////////////////////////////////////////////////////
    private static char[] palindromo(char[] palin, int k, int longitud, int i) {
        if (k > 0) {
            if (palin[i] == palin[palin.length - 1 - i]) {

            } else if (palin[i] >= palin[palin.length - 1 - i]) {
                if (Integer.valueOf(String.valueOf(palin[i])) == 9) {

                } else if (k > 1) {
                    palin[i] = '9';
                    k--;
                    palin[palin.length - 1 - i] = palin[i];
                    k--;
                }
                System.out.println(String.valueOf(palin));
            } else if (Integer.valueOf(String.valueOf(palin[palin.length - 1 - i])) == 9) {
            } else if (k > 1) {
                palin[palin.length - 1 - i] = '9';
                k--;
                palin[i] = palin[palin.length - 1 - i];
                k--;
                
                System.out.println(String.valueOf(palin));
            }
        } else {
            System.out.print("-1");
            return palin;
        }

        boolean retorno = isPal(palin, 0, longitud);

        if (retorno) {
            return palin;
        }

        //////////////////////////////////////////////////////
        if (k > 0 && i < longitud) {
            i++;
            palindromo(palin, k, longitud, i);
        }

        return palin;
    }

    public static char[] pals(char[] palin, int k, int longitud, int i) {

        if (k > 1) {
            if (Integer.valueOf(String.valueOf(palin[i])) < 9) {
                palin[i] = '9';
                k--;
                palin[palin.length - 1 - i] = '9';
                k--;
            }
        }

        if (k > 1 && i < longitud) {
            i++;
            pals(palin, k, longitud, i);
        }

        return palin;
    }
}

/*public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
       char[] findupper = s.toCharArray();
        int countUpper = 1;
        for(int i=0; i<findupper.length;i++){
            if(findupper[i]>=65 && findupper[i]<=91){
                ++countUpper;
            }            
        }
        System.out.println(countUpper);        
    }
}*/
