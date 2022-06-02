package com.algorithms;

import java.util.Scanner;

public class SamekhQueue {
     private class Node{
         private int data;
         private Node next;

         private  Node(int data){
             this.data = data;
         }
     }

     private Node head; //remove from the head
     private Node tail; // add things here

     public boolean isEmpty(){
         return head ==null; // return if head is null, if null it'll be true if not be false.
     }
     public int peek(){
         if (head == null){
             System.out.println("THERE IS NO DATA");
             add(0);
         }
         System.out.println(head.data);
         return head.data;
     }
     public void add(int data){
         Node node = new Node(data); //create the node that nees to be added.
         if (tail != null){ //if the tail is NOT null, meaning it has something in it
             tail.next = node; //then we will put the node with the data at it's next node
         }
         tail = node;
         if(head ==null){ //this is basically making it so that you can add something into the queue if it's empty
             head=node;
         }
     }
     public int remove(){//removing from head of this list
         int data = head.data;//getting heqd from data
         head = head.next; //basically removes from queue

         if (head == null){
             tail = null;
         }
        return data;
     }
}