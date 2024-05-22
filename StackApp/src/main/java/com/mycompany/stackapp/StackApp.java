/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stackapp;

/**
 *
 * @author quent
 */
public class StackApp {
    public static void main(String[] args) {

        //Initiate the an empty String stack
        System.out.println("Initiate the stack");
        LinkedListStack<String> stack = new LinkedListStack<>();

        //Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());
        // Printing the stack size
        System.out.println("Stack Size: " + stack.size() + "\n");
        
        //Try to pop an element when the queue is empty
        try{
            System.out.println(stack.pop());
        }
        catch(StackException ex){
            System.out.print(ex.getMessage()+ "\n");
        }

        // Pushing 5 person names in the stack
        stack.push("Erkan");
        stack.push("Sergiu");
        stack.push("Erik");
        stack.push("Janni");
        stack.push("Flaviu");

        //Check if the stack is no more empty
        System.out.println("Is the stack empty after adding 5 elements? " + stack.isEmpty());
        // Printing the stack size
        System.out.println("Stack Size: " + stack.size());

        // Printing all the elements of the stack
        System.out.println("\nStack Contents:");
        System.out.println(stack);

        // Peeking at the top element
        System.out.println("Peek at the top element: " + stack.peek());

        // Popping an element
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement + "\n");

        // Printing the stack after popping
        System.out.println("Stack Contents after popping:");
        System.out.println(stack);
    }
}
