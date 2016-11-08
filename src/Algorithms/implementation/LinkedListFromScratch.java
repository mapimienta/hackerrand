package Algorithms.implementation;
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

public class LinkedListFromScratch {
    static Node head_;
    public static Node insert(Node head, int data){
        if(head==null){
            Node temp = new Node(data);
            //Node current = head_;
            head_ = temp;
        }else{
            Node temp = new Node(data);
            Node current = head_;
            while(current.next!=null){
                current = current.next;
            }
            current.next = temp;
        }
        
        return head_;
    }
    
    public static void display(Node head){
        Node start = head;
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Node head = null;
        int d = in.nextInt();
        
        while(d-->0){
            int ele = in.nextInt();
            head = insert(head,ele);
        }
        display(head);
        in.close();
    }
}
