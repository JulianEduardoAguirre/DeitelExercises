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
public class NegativePositiveAndZeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pos = 0, neg = 0, zeroes = 0, num;
        
        for (int j = 0; j < 5; j++) {
            num = Consola.leerEntero("Enter a value: ");
            if(num == 0) zeroes++;
            else if (num < 0) neg++;
            else pos++;
            
            
        }
        
        System.out.printf("Positive: %d%nNegative: %d%nZeros: %d%n", pos, neg, zeroes);
        
        
        
    }
    
}
