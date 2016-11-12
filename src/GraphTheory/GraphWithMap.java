package GraphTheory;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Scanner;


class Grafos{
    Scanner in = new Scanner(System.in);
    public Grafos(int vertices){
        Map<Integer, List<Integer>> m = new HashMap<Integer, List<Integer>>() {};
        
        for(int i = 0; i < vertices; i++){
           int aristas = in.nextInt();    
            List lista = new ArrayList<>();
            
            for(int j=0;j<aristas;j++){ 
                int arista =in.nextInt();                              
                lista.add(arista);
            }
            
            m.put(i,lista);
        }
    }
}


public class GraphWithMap {   
    static Grafos g;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int verts = in.nextInt();
        g = new Grafos(verts);
    }
}
