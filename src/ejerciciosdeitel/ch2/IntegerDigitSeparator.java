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
public class IntegerDigitSeparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number, divisor = 10000;
        
        do {            
            number = Consola.leerEntero("Enter a five digits numebr: ");

        } while (number < 10000);
        
        while (divisor > 0) {
            System.out.printf("%d   ", number / divisor);
            number %= divisor;
            divisor /= 10;
        }
        
        System.out.println("");

    }
    
}
