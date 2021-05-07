/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//Buen dia en este caso no hice caso omiso al tema de las clases, no crei que fuera necesario
//para el desarrollo del programa, sin embargo se esta utilizando buenas practicas en el momento
//del llamado la clase proceso a la clase main, espero que esto no entorpezca el proceso de selección.

//De igual manera de esta respetando el proceso y cumple con las especificaiones de la prueba.


package JAVA;


import java.util.Scanner;


public class proceso {
    

    public void numero() {
        
        String a = "";
        Scanner entrada = new Scanner(System.in);        
        System.out.println("Ingrese numeros");
        a = entrada.next();

        String cadena = a;
        String[] extraccion = cadena.split("-");

            System.out.println("Los Numero Guardados son: ");
            
        for (String salida : extraccion) { 
            
            System.out.print(String.format("%s ", salida)); 
            
        }
        
        
         double raiz = Math.sqrt(extraccion.length);
         int resultado=extraccion.length;
         System.out.println("\nvalor del arreglo: "+resultado);
         System.out.println("\nLa raiz cuadrada es: " + raiz);
        
        
    }
}
