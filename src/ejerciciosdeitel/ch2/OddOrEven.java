/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeitel.ch2;

import librerias.Consola;

/**
 *
 * @author aguir
 */
public class OddOrEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = Consola.leerEntero("Enter a number: ");
        
        System.out.println(number % 2 == 0? "Even":"Odd");
    }
    
}
