package com.algorithms;

import java.util.Optional;

public class Queue<V> {
    // DblLinkedListNode is provided
    // create a private Node for "head"
    // create a private Node for "tail"
    private DblLinkedListNode<V> head;
    private DblLinkedListNode<V> tail;

    public Queue() {
        head = null;
        tail = null;
    }

    public void enqueue(V item) {
//     add an item to the queue
//     pseudo code
//        create new node from item, null previous and next
        DblLinkedListNode<V> intQueueNode = new DblLinkedListNode<>(item, null, null);
//        if head is null:
        if (head ==null){
            head = intQueueNode;
            tail = intQueueNode;
        }
//            point head and tail at new node
//        else:
        else{
            tail.setNext(intQueueNode);
            intQueueNode.setPrevious(tail);
            tail = intQueueNode;
        }
//            set tail next to new node
//            set new node's previous to tail
    }

    public V dequeue() {
//     get and remove an item from the queue
//     pseudo code
        if(head == null){
            return null;
        }
        V value = null;
        value= head.getValue();//used the generic to specify the type... which we don't know
        head = head.getNext();

//        1. if head is null
//              return null
//        2. node = the node head is pointing at
//        3. head = head.next
        if (head != null){
            head.setPrevious(null);
        }
//        4. if head is not null:
//                set head previous to null
//        5. return node.value
        return value;
    }

    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.enqueue("one");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue("one");
        q.enqueue("two");
        q.enqueue("three");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue("two");
        q.enqueue("three");
        System.out.println("2 values added to queue");
        System.out.println("Now try to remove both values");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println("\nAll values removed, try to remove another");
        System.out.println(q.dequeue());
        System.out.println("\nQueue should be empty now, add a new item");
        q.enqueue("four");
        System.out.println("\nNow remove the one item");
        System.out.println(q.dequeue());
        System.out.println("\nAll items should be gone, try to remove one");
        System.out.println(q.dequeue());
    }
}
