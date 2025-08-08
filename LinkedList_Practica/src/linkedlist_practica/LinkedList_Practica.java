/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist_practica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
       ArrayList<String> listaNumeros = new ArrayList<>();
       LinkedList<String> listaNombres = new LinkedList<>();
       //uso de map
       Map<String, Integer> maps = new HashMap<>();
       maps.put("christian, edad ", 23);
       maps.put("gabriela, edad ", 15);
       
        System.out.println(maps);

        //uso de metodo .of
       var listasEnlazadas = List.of(2,3,4,5,6,7);
       listasEnlazadas.forEach(System.out::println);
       
        System.out.println("");
       
       var listaLetras = List.of("A","B","C");
       
       listaLetras.forEach(System.out::println);
       
       
      /* 
       //se va agregar datos a la lista 
       listaNombres.add("Christian");
       listaNombres.add("Serbino");
       listaNombres.add("Gabriela");
       
       listaNombres.addFirst("Inicio---->");
       listaNombres.addLast("<-----Final");
       
       
       listaNumeros.add("uno");
       listaNumeros.add("dos");
       listaNumeros.add("tres");
        System.out.println("El contenido de la LinkedList es: ");
        for (String lista : listaNombres){
        
            System.out.println(lista);
            
        }
       
        System.out.println("\nEl elemnto en la posicion 2 es: " + listaNombres.get(2));
        
        System.out.println( " el valor en la posicion 3 de la linkedlist es: " + listaNombres.get(3)+ "\nEl valor en la posicion 3 sera eliminado: " + listaNombres.remove(3) + "\n");
       
        for (String lista : listaNombres){
            
        System.out.println("la lista modificada es ---> " + lista);
        
        
        //gene 
        
       
        
        }
*/
        
    }
    
}
