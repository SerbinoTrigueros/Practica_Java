/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion;

import java.util.List;

/**
 *
 * @author serbi
 */
public class Programacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" mi primera practica usando repositorio :D ");
        System.out.println(" The Neighbourhood - Sweater Weather ");
        
        var lista_Carros = List.of("BMW", "AUDI","NISSAN","TOYOTA");
        lista_Carros.forEach(System.out::println);
        
        System.out.println("");
        
        for (var listas: lista_Carros){
            System.out.println(listas);
        }
    }   
}
