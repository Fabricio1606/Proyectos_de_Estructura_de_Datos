/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura_de_datos;

/**
 *
 * @author User
 */
public class main {

    public static void main(String[] args) {
        /*int[] arr = {12, 34, 64, 2, 3};
        //---------------Recursividad--------------//
        System.out.println(recursion.factorial(3));
        System.out.println(recursion.encontrarMax(arr, 0, 0));*/

        //---------------Pilas----------------------
        /*stack <String> Pila = new stack<String>();
        
        Pila.push("H");
        Pila.push("P");
        Pila.push("J");
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());*/
        //-------------------Colas--------------------
        queue<Integer> Cola = new queue<Integer>();
        Cola.enqueue(1);
        Cola.enqueue(2);
        Cola.enqueue(4);
        System.out.println(Cola.dequeue());
        System.out.println(Cola.dequeue().getValue());
    }
}
