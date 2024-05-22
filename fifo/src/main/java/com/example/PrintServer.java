package com.example;
import java.util.Deque;
import java.util.ArrayDeque;

/**
 * A class implementing a FIFO queue using an ArrayDeque.
 */

public class PrintServer implements IPrinter{

    // Using ArrayDeque to implement the print job queue
    // I chose this built-in Collection because its methods provide explicit names and functionalities
    private Deque<String> queue;

    // Method to check if the queue is empty
    public boolean isEmpty(){
        // Using the built-in isEmpty() method from ArrayDeque
        return queue.isEmpty();
    }

    //Constructor to intiate the printServer class a
    public PrintServer(){
        // Initialize the queue using ArrayDeque
        queue = new ArrayDeque<>();

    // Print a message indicating the initialization of the PrintServer queue
        System.out.println("PrintServer Queue initated\n");
    }

    // Method to submit a print job to the queue
    @Override
    public void submitPrintJob(String job){
        // Using the addLast method to maintain the FIFO logic
        queue.addLast(job);
    }
    //Method to print and remove next job
    @Override
    public String printNextJob(){
        // Check if the queue is empty
        if(isEmpty()){
            // If the queue is empty, throw a FIFOException
            throw new FIFOException("Exception: No job in the queue to print\n");
        }
        else{
            // If the queue is not empty, remove and return the first job in the queue
            return queue.removeFirst();
        }
    }

    // Method to get the size of the queue
    @Override
    public int size(){
        return queue.size();
    }

    // Method to peek at the next job in the queue without removing it
    @Override
    public String pollNextJob(){
        // Checking if the queue is empty before peeking
        if(isEmpty()){
            // If the queue is empty, throw a FIFOException
            throw new FIFOException("Exception: No job in the queue to poll\n");
        }
        else{
             // If the queue is not empty return the first job in the queue
            return queue.peekFirst();
        }
    }

    // Method to generate a string representation of the queue
    @Override
    public String toString(){
        // Checking if the queue is empty
        if(isEmpty()){
            //If empty print right message
            return "No job in the queue\n";
        }
        else{
            // Generating a string representation of the queue, starting from the top
            StringBuilder msg = new StringBuilder("<--TOP-->\n");
            // Looping through each element in the queue and adding next element using a lambda expression
            queue.forEach(m -> msg.append(m + "\n"));
            // Appending a message indicating the bottom of the queue
            msg.append("<--BOTTOM-->\n");
            
            return msg.toString();
        }
    }




}
