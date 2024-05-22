package com.example;

/**
 *
 * @author quent
 */

public interface IPrinter {

    //Method to add a job for printing.
    public void submitPrintJob(String job);

    //Method to return the name of the next job in a FIFO sequence, then remove the job.
    public String printNextJob();

    //Method to return the number of jobs waiting to be printed.
    public int size();

    //Method tp returns the name of the next job to be printed without removing it.
    public String pollNextJob();

}
