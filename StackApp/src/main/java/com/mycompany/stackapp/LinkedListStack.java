/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stackapp;

/**
 * A class implementing a stack using a linked list data structure.
 * @param <T> The type of elements stored in the stack.
 */

public class LinkedListStack<T> implements StackInterface<T>{
    /*Private inner class so it cannot be use anywhere else
    * Representing a node in the stack using linked list
    */

    private class Node<T>{

        private T element; //Element stored in the noe
        private Node<T> next; //Reference to the next element

        //Constructor to create a node
        public Node(T element, Node<T> next){
            this.element= element;
            this.next = next;
        }

        //Getter returning the element
        public T getElement() {//Getter 
            return element;
        }        

        //Getter returning the next element
        public Node<T> getNext() {
            return next;
        }

    }
    
    // Constructor (Not mandatory as the compiler always adds a default no-parameter constructor)
    // Used to indicate the initialization of the LinkedListStack
    public LinkedListStack(){
        System.out.println("Stack initiated\n");
    }

    //Reference to the first node in the stack
    Node<T> first;

    // Method to check if the stack is empty, returning true if it is and false otherwise.
    // Made public as it can be useful on both sides.
    public boolean isEmpty(){
        return first == null;
    }

    // Method to calculate the size of the stack.    
    public int size(){
        // Initializing the size counter to 0.
        int size = 0;

        // Helper node to traverse the stack and calculate the size.
        Node<T> helperNode = first;

        // Looping through each node until the next node is null, incrementing size each time.
        while(helperNode != null){
            helperNode = helperNode.getNext();
            size++;
        }
        return size;
    }

    /*
     * Pushes a new element onto the top of the stack.
     */
    @Override
    public void  push(T element){
        // If the stack is empty, the new element becomes the first node.
        if(isEmpty()){
            first = new Node<T>(element, null);
        }
        // If not empty, the new element is added as the new first node.
        else{
            Node<T> oldFirst = first;
            first = new Node<T>(element, oldFirst);
        }
    }

    /*
     * Removes and returns the element at the top of the stack.
     * Return The element removed from the top of the stack.
     * Throws StackException if the stack is empty.
     */
    @Override
    public T pop(){
        // If the stack is empty, throw a custom exception with an appropriate message.
        if(isEmpty()){
            throw new StackException("Exception: Impossible to pop: No element in the stack\n");
        }
        // If not empty, remove and return the top element, updating the first node.
        else{
            T element = first.getElement();
            first = first.getNext();
            return element;
        }
    }

    /*
     * Returns the element at the top of the stack without removing it.
     * Return the element at the top of the stack.
     * Throws StackException if the stack is empty.
     */
    @Override
    public T peek(){
         // If the stack is empty, throw a custom exception with an appropriate message.
        if(isEmpty()){
            throw new StackException("Exception: Impossible to peek: No element in the stack\n");
        }
        // If not empty, remove and return the top element.
        else{
            return first.getElement();
        }
    }

    /*
     * Returns a string representation of the stack.
     */
    @Override
    public String toString() {
        // If the stack is empty, return an appropriate message.
        if (isEmpty()) {
            return "Empty Stack";
        }
        // Otherwise, loop through each element, adding it to the message until there are no more elements.
        else {
            Node<T> current = first;
            String msg = "<-- TOP -->";
            while (current != null) {
                msg += "\n" + current.getElement().toString();
                current = current.getNext();
            }
            return msg + "\n<-- BOTTOM -->\n";
        }
    }
}
