/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

/**
 *
 * @author jonathan
 */
import java.util.Scanner;
import lavarropasjonathanjavier.Programa;

public class Lavarropas {
    
    public static void main(String args[]){
        
            Programa funcion = new Programa();
        
        
        
            Scanner entrada = new Scanner(System.in);
            
            
            
            System.out.println("Eleija el tipo de lavado: ");
            System.out.println("1_Lana \n 2_Ropa Sucia \n 3_Economico \n 4_Ropa de Bebé ");
           
           
           int seleccion = entrada.nextInt();
           switch(seleccion){
               case 1:
                   System.out.println("Lana");
                   funcion.llenado();
               break;
               case 2:
                   System.out.println("Ropa Sucia");
                   funcion.llenado();
               break;
               case 3:
                   System.out.println("Economico");
                   funcion.llenado();
               break;
               default:
                   System.out.println("Ropa de Bebé");
                   funcion.llenado();
       
       
            }

    
    }
}
