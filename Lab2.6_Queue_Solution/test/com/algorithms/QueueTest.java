package com.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class QueueTest {
    //TODO create a Queue test fixture reference
    Queue<Customer> queue = null;
    @Before
    public void setUp() throws Exception {
        //TODO instantiate the queue test fixture
        //TODO populate with one customer object
        queue = new Queue<>();
        queue.enqueue(new Customer(12345, "Andrew Smith", 255));
    }

    //TODO design and implement positive and negative tests and give them decent names

    @Test
    public void enqueueToNonEmptyQueuePositive() {
        String expected1 = "Andrew Smith";
        String expected2 = "Jane Smith";
        Customer cust = new Customer(23456, expected2, 300);
        queue.enqueue(cust);
        String actual = queue.dequeue().getName();
        assertEquals(expected1, actual);
        actual = queue.dequeue().getName();
        assertEquals(expected2, actual);
    }

    @Test
    public void dequeueExistingSingleElementPositive() {
        String expected = new Customer(12345, "Andrew Smith", 255).toString();
        String actual = queue.dequeue().toString();
        assertEquals(expected.toString(), actual);
    }

    @Test
    public void dequeueExistingTwoElementPositive() {
        String expected = new Customer(12345, "Andrew Smith", 255).toString();
        Customer cust = new Customer(23456, "Jane Smith", 300);
        queue.enqueue(cust);
        String actual = queue.dequeue().toString(); // test first node
        assertEquals(expected.toString(), actual);
        actual = queue.dequeue().toString();  // test second node
        assertEquals(cust.toString(), actual);    }

    @Test
    public void dequeueEmptyQueueNegative() {
        queue = new Queue<>();
        assertNull(queue.dequeue());
    }

    @Test
    public void enqueueNullNegative() {
        queue.enqueue(null);
        String expected = new Customer(12345, "Andrew Smith", 255).toString();
        String actual = queue.dequeue().toString();
        assertEquals(expected.toString(), actual);
    }
}