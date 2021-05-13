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
public class Programa {
    private int kgRop;
       private int Gradlavado;
       Scanner entrada = new Scanner(System.in);
    
    
    
     public void llenado(){
        
            System.out.println("Elija el tipo de llenado \n(1)10kg \n (2)15kg");
            kgRop = entrada.nextInt();
            
            if(kgRop == 1){
            
                System.out.println("El tipo de llenado es de 10kg");
                lavado();
            
            }else if(kgRop == 2){
            
                System.out.println("El tipo de llenado es de 15kg");
                lavado();
            }else{
            
                System.out.println("No se puede realizar el lavado");
                
            }
            
        
        }
        
        public void lavado(){
        System.out.println("ELija el tipo de lavado (1)120° \n (2)40°");
        Gradlavado = entrada.nextInt();
        
        if(Gradlavado == 1){
            System.out.println("Cargando el agua 120°");
            System.out.println("Realizando el lavado 90°");
            System.out.println("Centrifugando 60°");
            System.out.println("Cargando el agua 40°");
            System.out.println("Realizando el lavado 30°");
            System.out.println("Centrifugando 10°");
            System.out.println("Cargando el agua 8°");
            System.out.println("Realizando enguaje 5°");
            System.out.println("Desagotando el agua 3°");
            secado();
      
        }else if(Gradlavado == 2){
            System.out.println("Cargando el agua 40°");
            System.out.println("Realizando el lavado 30°");
            System.out.println("Centrifugando 10°");
            System.out.println("Cargando el agua 8°");
            System.out.println("Realizando enguaje 5°");
            System.out.println("Desagotando el agua 3°");
           secado();
        
        }else{
            System.out.println("No se puede realizar el lavado");
           
        }
}
       
       public void secado(){
       
           System.out.println("Realizando el proceso de secado 2°");
            System.out.println("Finalizado");
       
       }
}
