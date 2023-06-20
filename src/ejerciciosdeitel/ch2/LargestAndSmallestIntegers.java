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
public class LargestAndSmallestIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] list = new int[5];
        int min, max;
        
        for (int i = 0; i < list.length; i++) {
            list[i] = Consola.leerEntero("Enter the " + (i+1) + "st integer");
        }
        
        min = list[0];
        max = list[0];
        
        for (int i = 1; i < list.length; i++) {
            if(list[i] > max) max = list[i];
            if(list[i] < min) min = list[i];
        }
        
        System.out.printf("Min: %d%n", min);
        System.out.printf("Max: %d%n", max);
        
    }
    
}
