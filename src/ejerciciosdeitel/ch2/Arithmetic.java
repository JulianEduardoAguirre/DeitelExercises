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
public class Arithmetic {
    /* Write an application that asks the user to enter two integers, obtains them
    from the user and prints their sum, product, difference and quotient (division). Use the techniques
    shown in Fig. 2.7*/
    
    public static void main(String[] args){
        int num1, num2;
        num1 = Consola.leerEntero("Input first number: ");
        num2 = Consola.leerEntero("Input second number: ");
        
        System.out.printf("Sum: %d%n", num1+num2);
        System.out.printf("Sub: %d%n", num1-num2);
        System.out.printf("Prod: %d%n", num1*num2);
        if(num2 != 0){
            System.out.printf("Quotient: %d%n", num1/num2);
        } else {
            System.out.println("Divition by 0");
        }
        
    }
    
    
}
