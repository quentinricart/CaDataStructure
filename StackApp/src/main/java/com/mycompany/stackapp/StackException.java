/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stackapp;

/**
 * Custom exception class for stack-related errors.
 * Extends RuntimeException for unchecked exception.
 */

public class StackException extends RuntimeException{

    public StackException(String msg){
          // Calls the superclass constructor to set the detail message.
        super(msg);
    }

}
