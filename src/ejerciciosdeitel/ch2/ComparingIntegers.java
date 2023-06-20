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
public class ComparingIntegers {
    /*Write an application that asks the user to enter two integers, obtains
    them from the user and displays the larger number followed by the words "is larger". If the num-
    bers are equal, print the message "These numbers are equal".*/
    
    public static void main(String... args){
        
        int num1, num2;
        num1 = Consola.leerEntero("Enter first number: ");
        num2 = Consola.leerEntero("Enter second number: ");
        
        if(num1 == num2) System.out.println("These numbers are equal");
        else if (num1 > num2) System.out.printf("%d is larger%n", num1);
        else System.out.printf("%d is larger%n", num2);
        
        
    }
    
}
