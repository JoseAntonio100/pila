/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Pila {
Scanner teclado = new Scanner(System.in);
String []pila = new String[]{"A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,W,X,Y,Z"};
int tope=pila.length;
int inicio=0;
public int llenarpilaa(){
    if(tope>=pila.length){
        System.out.println("la pila esta llena:/");
    }
    if (pila[tope]== null){
        System.out.println("ingrese dato");
        pila[tope]= teclado.nextLine();
        String temp;
        temp = pila[tope];
        tope++;    
    }
    return tope;
}
public String vaciarpila(){
    String temp= null;
    if(tope>=0);
    {
        temp = pila[tope-1];
       pila[tope-1]= null;
       tope--;
    }
    return temp;
}
public void verpila(){
    for(String Pila:pila){
       System.out.println(Arrays.asList(Pila));
    }
}
    public static void main(String[] args) {
       Pila objeto = new Pila();
       Scanner opcion = new Scanner(System.in);
       int seleccion;
           System.out.println("menu de la pila");
           System.out.println("1....ingresa dato...");
           System.out.println("2....vaciar pila...");
           System.out.println("3....ver pila...");
           System.out.println("teclee el dato que desea");
           seleccion=opcion.nextInt();
           switch(seleccion){
               case 1:
                 System.out.println("");
                 objeto.llenarpilaa();
                 System.out.println("");
                 break;
               case 2:
               System.out.println("");
               objeto.vaciarpila();
               System.out.println("");
               case 3:
               System.out.println("");
               objeto.verpila();
               System.out.println("");
               System.out.println("la pila esta llena:/");
           }
    }
}

    
