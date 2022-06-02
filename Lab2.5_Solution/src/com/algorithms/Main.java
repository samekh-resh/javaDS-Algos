package com.algorithms;

class Main {

    public static void main(String[] args) {
        SinglyLinkedList<Customer> customerSinglyLinkedList = new SinglyLinkedList<>();

        customerSinglyLinkedList.addFront(new Customer(234, "jamal", 234.45f ));
        customerSinglyLinkedList.addFront(new Customer(443, "lucy", 217.45f ));

        System.out.println(customerSinglyLinkedList);
    }
}