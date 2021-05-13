# encapsulamientoPaquetesEmpresa
ejercicio n° 9


package Empresa;


import java.util.Scanner;
import lavarropasjonathanjavier.Programa;

public class Lavarropas {
    
    public static void main(String args[])
    {
        
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

package lavarropasjonathanjavier;


public class Lavarropa {

    
    public static void main(String[] args) 
    {
        
        
        Funcion lavado = new Funcion();
        lavado.TipoDeRopa();
    }
    
}



package lavarropasjonathanjavier;

import java.util.Scanner;


public class Funcion
{
    private int kilos ;
    
       private String marca;
       
       private String modelo;
       
       //LLamo a la clase con el metodo constructor o sea Hago una instanciacion creando un objeto prog
       
       Programa prog = new Programa();
        Scanner entrada = new Scanner(System.in);
        
      public Funcion()
      {
       
          kilos = 5;
           marca = "LG";
           modelo = "Logic Tech V1";
           
       }
       
        public void TipoDeRopa()
        {
           System.out.println("Eleija el tipo de lavado: ");
           System.out.println("1_Lana \n 2_Ropa Sucia \n 3_Economico \n 4_Ropa de Bebé ");
           
           
           int seleccion = entrada.nextInt();
           switch(seleccion)
           {
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

package lavarropasjonathanjavier;

import java.util.Scanner;

public class Programa
{
    private int kgRop;
    
       private int Gradlavado;
       
       Scanner entrada = new Scanner(System.in);
    
    
    
     public void llenado()
     {
        
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
        
        public void lavado()
        {
        System.out.println("ELija el tipo de lavado (1)120° \n (2)40°");
        Gradlavado = entrada.nextInt();
        
        if(Gradlavado == 1)
        {
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
      
        }
        else if(Gradlavado == 2)
        {
            System.out.println("Cargando el agua 40°");
            System.out.println("Realizando el lavado 30°");
            System.out.println("Centrifugando 10°");
            System.out.println("Cargando el agua 8°");
            System.out.println("Realizando enguaje 5°");
            System.out.println("Desagotando el agua 3°");
           secado();
        
        }
        else
        {
            System.out.println("No se puede realizar el lavado");
           
        }
}
       
       public void secado()
       {
       
           System.out.println("Realizando el proceso de secado 2°");
            System.out.println("Finalizado");
       
       }
}

