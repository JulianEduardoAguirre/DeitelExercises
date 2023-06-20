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
public class ArithmeticSmallestAndLarger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Write an application that inputs three integers from the
        user and displays the sum, average, product, smallest and largest of the numbers.
        */
        
        int num1, num2, num3, max, min;
        num1 = Consola.leerEntero("Enter first number: ");
        min = num1;
        max = num1;
        
        num2 = Consola.leerEntero("Enter second number: ");
        num3 = Consola.leerEntero("Enter third number: ");
        
        if(num2 > max) max = num2;
        if(num3 > max) max = num3;
        
        if(num2 < min) min = num2;
        if(num3 < min) min = num3;
        
        
        System.out.printf("Sum: %d%n", num1+num2+num3);
        System.out.printf("Avg: %d%n", (num1+num2+num3)/3);
        System.out.printf("Prod: %d%n", num1*num2*num3);
        System.out.printf("Min: %d%n", min);
        System.out.printf("Max: %d%n", max);
        
    }
    
}
