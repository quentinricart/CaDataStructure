package com.example;

/**
 * Custom exception class for printServer-related errors.
 * Extends RuntimeException for unchecked exception.
 */

public class FIFOException extends RuntimeException{

    public FIFOException(String msg){
        // Calls the superclass constructor to set the detail message.
        super(msg);
    }

}
