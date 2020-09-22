/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;


import java.util.Scanner;
/**
 *
 * @author HP
 */
public class PilaUno {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int tope=0, tam,opt;
       
       System.out.println("ingresa el tamaño que quieres en la pila");
       int pila [] = new int [tam = sc.nextInt()];
       do{
           System.out.println("\n 1..Agregar\n"
                   +"2...Mostrar\n"
                   +"3...Eliminar\n"
                   +"4...Salir");
           switch (opt= sc.nextInt()){
               case 1:
                   if (tope<tam){
                   System.out.println("adjunta la letra que deseas");
                   pila [tope] = sc.nextInt();
                   tope++;
                   }else{
                       System.out.println("la pila esta llena....");
                   }
                   break;
               case 2:
                   if (tope>0){
                       System.out.println("Los elementos de la pila son estos");
                       for (int i = tope-1; i>=0; i--);
               int i = 0;
                       System.out.println(""+ pila [i]);
                   }else{
                       System.out.println("La pila se encuentra vacia");
                   }
                   break;
               case 3:
                   if (tope !=0){
                       System.out.println("Elimnar el ultimo dato");
                       tope--;
                   }
                   else{
                       System.out.println("No hay elementos a mostrar");
                   }
                   break;
       }
    }while(opt !=25);
}
}
