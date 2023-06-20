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
public class Circle {

    /**
     * @param args the command line arguments
     */
    
    int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    
    public float CalcDiameter(){
        return (float)(radius * 2);
    }
    
    public float CalcCircunference(){
        return (float)(Math.PI * this.CalcDiameter());
    }
    
    public float CalcArea(){
        return (float)(Math.PI * radius * radius);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circle c1 = new Circle(Consola.leerEntero("Enter the radius: "));
        System.out.printf("Diameter: %f%n", c1.CalcDiameter());
        System.out.printf("Circunference: %f%n", c1.CalcCircunference());
        System.out.printf("Area: %f%n", c1.CalcArea());
        
        
    }
    
}
