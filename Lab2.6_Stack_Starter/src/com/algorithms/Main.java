package com.algorithms;

class Main {

    public static void main(String[] args) {
        Stack<Customer> customerStack= new Stack<>();

        customerStack.push(new Customer(22, "mark", 22f));
        customerStack.push(new Customer(32, "jacob", 21f));
        customerStack.push(new Customer(542, "mark", 12f));
        Customer custom = customerStack.pop();
        System.out.println(custom.toString());
    }
}