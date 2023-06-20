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
public class BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double weight, height;
        
        weight = Consola.leerDouble("Enter the weight (kg): ");
        height = Consola.leerDouble("Enter the height (m): ");
        
        Person p1 = new Person(weight, height);
        System.out.printf("Your BMI is: %f%n%n", p1.CalculateBMI());
        
        String message = "BMI VALUES\nUnderweight:\tless than 18.5\n"
                + "Normal:\t\tbetween 18.5 and 24.9\n"
                + "Overweight:\tbetween 25 and 29.9\n"
                + "Obese:\t\t30 or greater";
        
        System.out.println(message);
        
    }
    
    

}

class Person {
    private final double weight;
    private final double height;

    public Person(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double CalculateBMI(){
        return weight / height / height;
    }
}