/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavarropasjonathanjavier;

import java.util.Scanner;

/**
 *
 * @author jonathan
 */
public class Funcion {
    private int kilos ;
       private String marca;
       private String modelo;
       //LLamo a la clase con el metodo constructor o sea Hago una instanciacion creando un objeto prog
       Programa prog = new Programa();
        Scanner entrada = new Scanner(System.in);
        
      public Funcion(){
       
          kilos = 5;
           marca = "LG";
           modelo = "Logic Tech V1";
           
       }
       
        public void TipoDeRopa(){
           System.out.println("Eleija el tipo de lavado: ");
           System.out.println("1_Lana \n 2_Ropa Sucia \n 3_Economico \n 4_Ropa de Bebé ");
           
           
           int seleccion = entrada.nextInt();
           switch(seleccion){
               case 1:
                   System.out.println("Lana");
                   prog.llenado();
               break;
               case 2:
                   System.out.println("Ropa Sucia");
                   prog.llenado();
               break;
               case 3:
                   System.out.println("Economico");
                   prog.llenado();
               break;
               default:
                   System.out.println("Ropa de Bebé");
                   prog.llenado();
       
       
            }
        }  
        
}
