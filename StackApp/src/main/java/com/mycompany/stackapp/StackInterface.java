/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.stackapp;

/**
 *
 * @author quent
 * @param <T>
 */
public interface StackInterface<T>{

    //Method to add an element at the top of the stack
    public void push(T t);

    //Method to remove and return the top element of the stack
    public T pop();

    //Method to return the top element of the stack without removing it
    public T peek();
    

}