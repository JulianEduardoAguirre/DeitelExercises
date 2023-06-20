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
public class Multiples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=0, num2;
        
        while(num1 == 0){
            num1 = Consola.leerEntero("Enter the first number (apart from 0): ");
        }
        
        num2 = Consola.leerEntero("Enter the second number: ");
        
        System.out.println(num2 % num1 == 0? "Multiples":"Not multiples");
        
    }
    
}
