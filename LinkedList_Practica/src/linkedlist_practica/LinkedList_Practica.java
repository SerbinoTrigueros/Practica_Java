/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist_practica;

import java.util.LinkedList;

/**
 *
 * @author serbi
 */
public class LinkedList_Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se crea la lista de tipo linkedlist
       LinkedList<String> listaNombres = new LinkedList<>();
       
       //se va agregar datos a la lista 
       listaNombres.add("Christian");
       listaNombres.add("Serbino");
       listaNombres.add("Gabriela");
       
       listaNombres.addFirst("Inicio---->");
       listaNombres.addLast("<-----Final");
       
        System.out.println("El contenido de la LinkedList es: ");
        for (String lista : listaNombres){
        
            System.out.println(lista);
            
        }
       
        System.out.println("\nEl elemnto en la posicion 2 es: " + listaNombres.get(2));
        
        System.out.println( " el valor en la posicion 3 de la linkedlist es: " + listaNombres.get(3)+ "\nEl valor en la posicion 3 sera eliminado: " + listaNombres.remove(3) + "\n");
       
        for (String lista : listaNombres){
            
        System.out.println("la lista modificada es ---> " + lista);
        }
        
    }
    
}
