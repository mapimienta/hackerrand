package GraphTheory;

import java.util.LinkedList;
import java.util.Scanner;
import javafx.util.Pair;

public class SynchronousShopping {
    private final LinkedList<Pair<Integer,Integer>>[] adjacencylist;
    
    public SynchronousShopping(int vertices){
        adjacencylist = (LinkedList<Pair<Integer,Integer>>[]) new LinkedList[vertices];
    }
}
