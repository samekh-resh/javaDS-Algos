package com.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    //TODO create a Queue test fixture reference
    Queue<Customer> queue = null;
    @Before
    public void setUp() throws Exception {
        //TODO instantiate the queue test fixture
        //TODO populate with one customer object

        queue = new Queue<>();
        queue.enqueue(new Customer(12345, "Carlisle Mitchel", 255));
    }

    //TODO design and implement positive and negative tests and give them decent names

    @Test
    public void enqueue_InsertingToQueueWithContent() {
        String expected1 = "Carlisle Mitchel";
        String expected2 = "Judy Eichner";
        Customer cust = new Customer(23456, expected2, 300);
        queue.enqueue(cust);
        String actual = queue.dequeue().getName();
        assertEquals(expected1, actual);
        actual = queue.dequeue().getName();
        assertEquals(expected2, actual);

    }
    @Test
    public void dequeueExistingSingleElementPositive() {
        String expected = new Customer(12345, "Carlisle Mitchel", 255).toString();
        String actual = queue.dequeue().toString();
        assertEquals(expected.toString(), actual);
    }
    @Test
    public void dequeue_ExistingTwoElementPositive() {
        String expected = new Customer(12345, "Carlisle Mitchel", 255).toString();
        Customer customerToAdd = new Customer(23456, "Judy Eichner", 300);
        queue.enqueue(customerToAdd);
        String actual = queue.dequeue().toString(); // test first node
        assertEquals(expected.toString(), actual);
        actual = queue.dequeue().toString();  // test second node
        assertEquals(customerToAdd.toString(), actual);
    }

        @Test
    public void dequeue() {
    }
}