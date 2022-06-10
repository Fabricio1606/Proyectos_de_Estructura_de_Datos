/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura_de_datos;

/**
 *
 * @author User
 */
public class stack<T> {

    private node<T> top;

    public void push(T value) {

        node<T> newNode = new node<T>(value);

        //Con el if se indica que es el top esta vacio//
        if (top == null) {
            // Luego se indica que el top sea uhn newNode//
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }
    }
    
    public T pop () {
        node <T> aux = top;
        if (top != null) {
            top = top.getNext();
            
            return aux.getValue();
            
        }
        else {
            return null;
        }
    }
}
