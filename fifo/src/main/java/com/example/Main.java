package com.example;

/**
 *
 * @author quent
 */

public class Main {
    public static void main(String[] args) {
        
        //Create a PrintServer instance
        PrintServer printServer = new PrintServer();

        //Check if the queue is empty
        System.out.println("Is the queue empty? " + printServer.isEmpty() + "\n");

        //Check the size of the queue
        System.out.println("The size of the queue is: " + printServer.size() + "\n");

        //Display the list of print jobs when the list is empty
        System.out.println("List of print jobs:");
        System.out.println(printServer);

        //Try to print an elment when the queue is empty
        try{
            System.out.println(printServer.printNextJob());
        }
        catch(FIFOException ex){
            System.out.print(ex.getMessage()+ "\n");
        }

        //Submit print jobs
        printServer.submitPrintJob("HomeWork Data Structure");
        printServer.submitPrintJob("Homework Algorithms");
        printServer.submitPrintJob("Homework Computer Architecture");
        printServer.submitPrintJob("Homework Distributed System");

        //Check if the queue is no more empty
        System.out.println("Is the queue empty? " + printServer.isEmpty() + "\n");

        //Check the size of the queue after adding jobs
        System.out.println("The size of the queue is: " + printServer.size() + "\n");


        //Display the list of print jobs
        System.out.println("List of print jobs:");
        System.out.println(printServer);

        //Print the next job in the queue
        System.out.println("Printing next job: " + printServer.printNextJob() + "\n");

        //Display the updated list of print jobs
        System.out.println("Updated list of print jobs:");
        System.out.println(printServer);

        //Poll the next job in the queue without removing it
        System.out.println("Next job to be printed: " + printServer.pollNextJob() + "\n");

        // Display the list of print jobs again
        System.out.println("List of print jobs after polling:");
        System.out.println(printServer);
    }
}